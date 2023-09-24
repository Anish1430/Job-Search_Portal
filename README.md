# Read Me First
The following was discovered as part of building this project:

# Job Search Portal
* This project demonstrates a Job Search Portal implemented with Spring Boot. It includes CRUD operations on the Job entity, entity class validation using annotations, and querying capabilities. The application uses an H2 Database.

### Job Entity
#### java

    `public class Job {`
    `private Long id;`
        private String title;
    private String description;
    private String location;

    @Min(value = 20000, message = "Salary should be above 20,000")
    private Double salary;
    
    @Email(message = "Invalid email address")
    private String companyEmail;
    
    private String companyName;
    private String employerName;
    
    @Enumerated(EnumType.STRING)
    private JobType jobType; // Enum for job type
    
    private LocalDate appliedDate; 
        }
## JobType Enum
#### java

    public enum JobType {
    IT,
    HR,
    Sales,
    Marketing
    }
# Endpoints
## CRUD Operations using CrudRepository Methods
### Create Job:

`POST /jobs`
* Request Body: Job JSON 
### Retrieve Job by ID:

`GET /jobs/{id}`
### Update Job:

`PUT /jobs/{id}`
* Request Body: Job JSON
### Delete Job:

`DELETE /jobs/{id}`
## Custom Finder Methods
#### Retrieve Jobs by Title:

`GET /jobs?title={title}`
* Retrieve Jobs by Location:

`GET /jobs?location={location}`
## Custom Queries with @Query
* Retrieve Jobs by Salary Range:

`GET /jobs/salary?minSalary={minSalary}&maxSalary={maxSalary}`
* Retrieve Jobs by Employer Name:

* `GET /jobs/employer?name={employerName}`
## Running the Application
* Clone this repository.
* Open the project in IntelliJ or your preferred IDE.
* Run the application.
*  Access the H2 Database console at `http://localhost:8082/h2-console`. Use the JDBC URL `jdbc:h2:mem:testdb`, username `sa`, and leave the password field empty.
* Testing Endpoints
#### `Use Postman to test the API endpoints. Send HTTP requests (GET, POST, PUT, DELETE) to interact with the Job Search Portal.`

# Validations
### Salary should be above 20,000.
`Company email should be a valid email address.`
** Contributing
Feel free to open issues and pull requests for any improvements.

# License
* This project is licensed under the MIT License - see the LICENSE file for details.

* The original package name 'com.Anish.Job-Search_Portal' is invalid and this project uses 'com.Anish.JobSearch_Portal' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Github Link](https://github.com/Anish1430/Job-Search_Portal)
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web)
* [Validation](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#io.validation)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

