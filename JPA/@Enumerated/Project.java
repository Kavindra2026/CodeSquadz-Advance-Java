/*
@Enumerated(EnumType.ORDINAL)  -> enum values ordinal position (0,1,2…)
@Enumerated(EnumType.STRING)   -> enum values name ke form me
Default is EnumType.ORDINAL
*/

package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "project_name")
    private String projectName;

    @Enumerated(EnumType.STRING)
    @Column(name = "project_status")
    private ProjectStatus projectStatus;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getProjectName()
    {
        return projectName;
    }

    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }

    public ProjectStatus getProjectStatus()
    {
        return projectStatus;
    }

    public void setProjectStatus(ProjectStatus projectStatus)
    {
        this.projectStatus = projectStatus;
    }
}
// Short Explanation

// @Enumerated(EnumType.STRING) enum ka name DB me store karta hai

// ORDINAL ke comparison me STRING safe & recommended hota hai