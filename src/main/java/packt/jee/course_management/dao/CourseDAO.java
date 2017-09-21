package packt.jee.course_management.dao;

import org.springframework.stereotype.Repository;
import packt.jee.course_management.dto.CourseDTO;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;

@Repository
public class CourseDAO {
	private JdbcTemplate jdbcTemplate;
	
	public CourseDAO() {}
	
	@Autowired
	public void setDatasource (DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<CourseDTO> getCourses() {
		List<CourseDTO> courses = jdbcTemplate.query("select * from course", new CourseRowMapper());
		return courses;
	}

}
