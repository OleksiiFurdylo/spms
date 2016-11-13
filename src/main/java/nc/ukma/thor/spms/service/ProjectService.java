package nc.ukma.thor.spms.service;

import nc.ukma.thor.spms.entity.*;

import java.sql.Timestamp;
import java.util.List;

public interface ProjectService  extends Service<Project>{

    // chief mentor
    boolean setChiefUser(long projectId, User chief);
    boolean deleteChiefUser(long projectId);

    // team functionality
    boolean addTeam(long projectId, Team team);
    boolean deleteTeam(long projectId, long teamId);

    Team getTeam(long projectId, long teamId);
    List<Team> getAllTeams(long projectId);

    // file functionality at the project
    boolean uploadFile(long projectId, File file);
    boolean deleteFile(long projectId, long fileId);
    File getFile(long projectId, long  fileId);

    // traits
    boolean setTrait(long projectId, Trait trait);

    boolean deleteTrait(long projectId, long traitId);
    Trait getTrait(long projectId, long traitId);
    List<Trait> getTraits(long projectId);

    List <Project> getAllActiveProjects();
    Project getProject(long projectId);

    String getInfo(long projectId);
}

