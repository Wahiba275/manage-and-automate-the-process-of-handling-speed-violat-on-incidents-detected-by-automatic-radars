# manage-and-automate-the-process-of-handling-speed-violat-on-incidents-detected-by-automatic-radars
<h1>Table o content</h1>
<ul>
  <li><a href="#intro">Introduction</a></li>
  <li><a href="#tech">Technologies used</a></li>
  <li><a href="#archi">Technical Architecture</a></li>
  <li><a href="#diagram">Class Diagram</a></li>
  <li><a href="#part1">Part 1 : backend</a></li>
  <li><a href="#registration">Registration Service</a>
    <ul>
      <li><a href="#strReg">Structure</a></li>
       <li><a href="#postman">Test with Postman</a></li>
       <li><a href="#graphql">Test with GraphQl</a></li>
       <li><a href="#grpc">Test avec BloomGRPC </a></li>
       <li><a href="#soap">Test avec Soap</a></li>
    </ul>
  </li>
  <li><a href="#radar">Radar Service</a>
    <ul>
      <li><a href="strRadar">Structure</a></li>
    </ul>
  </li>
  <li><a href="#road">Road Radar Service</a>
  <ul>
      <li><a href="#roadStr">Structure</a></li>
    </ul>
  </li>
  <li><a href="infra">Infraction service</a>
    <ul>
      <li><a href="#infraStr">Structure</a></li>
    </ul>
  </li>
  <li><a  href="#conclusion">Conclusion</a></li>
</ul>
<h1 id="intro">Introduction</h1>
<p>In this project, our goal is to create a distributed system based on microservices to manage and automate the process of handling speed violation incidents detected by automatic radars. The system consists of three microservices, each serving a specific purpose.</br>
Firstly, we have the radar management microservice. Each radar is identified by a unique ID and is associated with a maximum speed limit, as well as longitude and latitude coordinates. This microservice enables the creation, retrieval, update, and deletion of radar-related information.</br>
Next, we have the vehicle registration microservice, responsible for managing vehicles and their owners. Each vehicle belongs to a single owner, identified by a unique ID, name, date of birth, email, and contact number. Vehicle information includes its ID, license plate number, brand, fiscal power, and model. This microservice facilitates the management of vehicle and owner information, including creation, retrieval, update, and deletion operations.</br>
Lastly, we have the violation management microservice. Each violation is identified by a unique ID and includes details such as the date of the violation, the radar number that detected the speed exceeding, the vehicle's license plate number, the vehicle's speed at the time of the violation, the radar's maximum speed limit, and the fine amount. This microservice enables the creation, retrieval, and update of violations.</br>
In addition to the standard operations of data consultation and modification, our system allows users to report a speed violation, which will result in the creation of a new violation record. Furthermore, vehicle owners have the ability to view their associated violations, providing them with an overview of their violation history.<br>
By combining these three microservices, our distributed system provides a comprehensive solution for managing and automating speed violation incidents detected by automatic radars. It offers improved traceability and efficient management of these violations.</p>
<h1 id="tech">Technologies Used</h1>
<p>This application utilizes a combination of technologies and frameworks, including:</p>
<ul>
  <li>Spring Boot</li>
  <li>Spring Cloud</li>
  <li>Eureka Descovery</li>
  <li>Angular</li>
  <li>Bootstrap</li>
  <li>MySQL</li>
</ul>
<h1 id="archi">Technical Architecture</h1>
<img src="archi2.PNG"/>
<h2 id="diagram">Class Diagram</h2>
<img src="class diagram.PNG"/>
<h1 id="part1">Part 1 : backend</h1>
<h3 id="registration">Registration Service</h3>
<ul>
  <li id="strReg">Structure : </li>
  <img src="/tests/registrationSoap.PNG"/>
  <li id="postman">Test with Postman</li>
  <b>Get all owners</b>
  <img src="/tests/allOwners.PNG"/>
  <p><b>Get owner by id</b></p>
  <img src="/tests/ownerById.PNG"/>
  <p><b>Get all Vehicles</b></p>
  <img src="/tests/allVehicles.PNG"/>
  <b>Get vehicle by id</b>
  <img src="/tests/vehicleById.PNG"/>
  <li id="graphql">Test with GraphQl</li>
  <b>Get All owners</b>
  <img src="/tests/OwnersGrapgql.PNG"/>
  <b>Get all Vehicles</b>
  <img src="/tests/vehiclesGrapgql.PNG"/>
  <b>get Vehicle by id</b>
  <img src="/tests/VByIdGrapgql.PNG"/>
  <b>Delete Vehicle</b>
   <img src="/tests/deleteVehicle.PNG"/>
  <li id="grpc">Test avec BloomGRPC </li>
   <b>Add owner</b>
  <img src="/Tests2/addOwnerGrpc.PNG"/>
   <b>get owner by Id</b>
  <img src="/Tests2/getOwnerGrpc.PNG"/>
   <b>Modify an Owner</b>
  <img src="/Tests2/modifyOwner.PNG"/>
   <b>Delete Owner</b>
  <img src="/Tests2/DeleteOwner.PNG"/>
   <b>Add Vehicle</b>
  <img src="/Tests2/addVehiclGrpce.PNG"/>
   <b>Get Vehicle by Id</b>
  <img src="/Tests2/getVehicle.PNG"/>
  <li id="soap">Test avec Soap </li> 
  <b>Le fichier WSDL</b>
  <img src="/Tests2/wsdl.PNG"/>
  <b>List of Owners</b>
  <img src="/Tests2/ownersSoap.PNG"/>
  <b>getOwnerSoap</b>
  <img src="/Tests2/getOwnerSoap.PNG"/>
  <b>List of Vehicles</b>
  <img src="/Tests2/VehicleSoap.PNG"/> 
</ul>
<h3 id="radar">Radar Service</h3>
<ul>
  <li id="strRadar">Structre</li>
  <img src="radar.PNG"/>
</ul>
<h3 id="road">Road Radar Service</h3>
<ul>
  <li id="roadStr">Structre</li>
  <img src="road.PNG"/>
</ul>

<h3 href="infra">Infraction Service</h3>
<ul>
  <li id="infraStr">Structre</li>
  <img src="infraction.PNG"/>
</ul>
<h1 id="conclusion">Conclusion</h1>
<p>In conclusion, the goal is to create a distributed system based on microservices that automates the management of speeding violations detected by automatic radars. The system comprises three microservices: radar management, vehicle registration, and infringement management. Each microservice handles specific functionalities, such as managing radar details, vehicle information, and infringement records. Additionally, the system allows for posting speeding violations and enables owners to view their respective infringements. This system provides an efficient and streamlined approach to handle the entire process of managing and automating speeding violation infractions.</p>




















