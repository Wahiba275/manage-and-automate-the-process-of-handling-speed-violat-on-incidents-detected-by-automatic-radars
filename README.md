# manage-and-automate-the-process-of-handling-speed-violat-on-incidents-detected-by-automatic-radars
<h1>Introduction</h1>
<p>In this project, our goal is to create a distributed system based on microservices to manage and automate the process of handling speed violation incidents detected by automatic radars. The system consists of three microservices, each serving a specific purpose.</br>
Firstly, we have the radar management microservice. Each radar is identified by a unique ID and is associated with a maximum speed limit, as well as longitude and latitude coordinates. This microservice enables the creation, retrieval, update, and deletion of radar-related information.</br>
Next, we have the vehicle registration microservice, responsible for managing vehicles and their owners. Each vehicle belongs to a single owner, identified by a unique ID, name, date of birth, email, and contact number. Vehicle information includes its ID, license plate number, brand, fiscal power, and model. This microservice facilitates the management of vehicle and owner information, including creation, retrieval, update, and deletion operations.</br>
Lastly, we have the violation management microservice. Each violation is identified by a unique ID and includes details such as the date of the violation, the radar number that detected the speed exceeding, the vehicle's license plate number, the vehicle's speed at the time of the violation, the radar's maximum speed limit, and the fine amount. This microservice enables the creation, retrieval, and update of violations.</br>
In addition to the standard operations of data consultation and modification, our system allows users to report a speed violation, which will result in the creation of a new violation record. Furthermore, vehicle owners have the ability to view their associated violations, providing them with an overview of their violation history.<br>
By combining these three microservices, our distributed system provides a comprehensive solution for managing and automating speed violation incidents detected by automatic radars. It offers improved traceability and efficient management of these violations.</p>
<h1>Technologies Used</h1>
<p>This application utilizes a combination of technologies and frameworks, including:</p>
<ul>
  <li>Spring Boot</li>
  <li>Spring Cloud</li>
  <li>Eureka Descovery</li>
  <li>Angular</li>
  <li>Bootstrap</li>
  <li>MySQL</li>
</ul>
<h1>Technical Architecture</h1>
<img src="archi2.PNG"/>
<h2>Class Diagram</h2>
<img src="class diagram.PNG"/>
<h1>Part 1 : backend</h1>
<h3>Registration Service</h3>
<ul>
  <li>Structure : </li>
  <img src="registration.PNG"/>
  <li>Test with </li>
</ul>





















