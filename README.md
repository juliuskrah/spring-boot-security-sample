# License
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

 [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.

# Pre-requisites
## Required
Java Development Kit 8 - Environment should be set
## Optional
Maven

# Running the source
## Windows
A batch script has been provided on the root of the repository _mvnw.cmd_ - a maven wrapper
Just run this script and all the maven dependencies will be downloaded and started on port `8080`
## Unix
On Unix systems a bash script is provided on the root of the repository _mvnw_ - a maven wrapper

This will start a tomcat instance on port `8080`. Next visit [http://localhost:8080/](http://localhost:8080) to run the application.
This is a spring-boot application with spring-security, you'd be prompted to authenticate. Use this credential:

- Username: _user_
- Password: _password_
