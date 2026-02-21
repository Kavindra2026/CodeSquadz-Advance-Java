import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.util.ByteArrayDataSource;
import javax.activation.DataHandler;
import javax.activation.DataSource;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import javax.servlet.annotation.MultipartConfig;

@MultipartConfig
public class SendEmailServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Gmail credentials
    private final String smtpHost = "smtp.gmail.com";
    private final String smtpPort = "587";
    private final String smtpUser = "kavindrasingh7535@gmail.com";
    private final String smtpPass = "hnve oqkx yjnq yhmc"; // Gmail App Password

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String to = request.getParameter("to");
        String senderName = request.getParameter("senderName"); // user input name
        String subject = request.getParameter("subject");
        String messageText = request.getParameter("message");

        if (to == null || to.trim().isEmpty() ||
                senderName == null || senderName.trim().isEmpty() ||
                subject == null || subject.trim().isEmpty() ||
                messageText == null || messageText.trim().isEmpty()) {

            response.setContentType("text/html");
            response.getWriter().println("<h3>Error: All fields are required!</h3>");
            return;
        }

        // message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", smtpPort);
        props.put("mail.smtp.ssl.trust", smtpHost);

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(smtpUser, smtpPass);
            }
        });

        session.setDebug(true);

        try {
            Message message = new MimeMessage(session);

            // Set From with display name
            message.setFrom(new InternetAddress(smtpUser, senderName));

            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);

            Multipart multipart = new MimeMultipart();

            // Text
            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setText(messageText);
            multipart.addBodyPart(textPart);

            // Attachment
            javax.servlet.http.Part filePart = request.getPart("file");
            if (filePart != null && filePart.getSize() > 1000) {
                MimeBodyPart attachmentPart = new MimeBodyPart();

                String contentDisp = filePart.getHeader("content-disposition");
                String fileName = contentDisp.substring(contentDisp.indexOf("filename=\"") + 10,
                        contentDisp.lastIndexOf("\""));

                InputStream fileContent = filePart.getInputStream();
                DataSource source = new ByteArrayDataSource(fileContent, filePart.getContentType());
                attachmentPart.setDataHandler(new DataHandler(source));
                attachmentPart.setFileName(fileName);
                multipart.addBodyPart(attachmentPart);
            }

            message.setContent(multipart);

            Transport.send(message);
            response.getWriter().println("<h3>Mail sent successfully with attachment!</h3>");

        } catch (MessagingException e) {
            e.printStackTrace();
            response.getWriter().println("<h3>Error sending email. Please try again.</h3>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
