package com.avneet;


	import javax.annotation.Resource;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.beans.factory.annotation.Value;
	import org.springframework.context.annotation.PropertySource;
	import org.springframework.core.env.Environment;
	import org.springframework.stereotype.Component;

	@Component
	@PropertySource("classpath:dbConfig.properties")
	public class project {
		private String projectName;
		private student1 student;
		
		@Autowired
		Environment env;
		public project() {
			
		}
		public project(String projectName, student1 student) {
			super();
			this.projectName = projectName;
			this.student = student;

		}
		
		public String getProjectName() {
			return projectName;
		}
		@Value("website for college")
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public student1 getStudent() {
			return student;
		}
		@Resource
		public void setStudent(student1 student) {
			this.student = student;
		}
		public void projectInfo() {
			System.out.println("Project Information:\nProject Name: "+ getProjectName()+"\nStudent : "
					+getStudent().getName()+","+getStudent().getRegNo());
		}
		public String toString() {
			return env.getProperty("user.Name")+" Project [projectName=" + projectName + ", \nstudent=" + student + "]";
	    }
		
		

	}
