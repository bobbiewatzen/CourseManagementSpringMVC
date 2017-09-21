package packt.jee.course_management.dao;

import packt.jee.course_management.dto.CourseDTO;
import java.sql.*;
import org.springframework.jdbc.core.*;

public final class CourseRowMapper implements RowMapper<CourseDTO> {
  @Override
  public CourseDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
    CourseDTO course = new CourseDTO();
    course.setId(rs.getInt("id"));
    course.setName(rs.getString("name"));
    course.setCredits(rs.getInt("credits"));
    return course;
  }
}