# SpriteCloudApi



## To run from cmd using newman:

 1. Go to project directory, install newman using >> npm install -g newman
 
 3. Write this command to run the collection along with the enviroment variables: 
 newman run SpriteCloudApi.postman_collection.json -e SpriteCloud.postman_environment.json
 
 4. To excute a new report, use this command and check the directory to see the generated report:
 XML Report
 newman run SpriteCloudApi.postman_collection.json -e SpriteCloud.postman_environment.json -r allure --reporters cli,junit,htmlextra --reporter-junit-export "newman/report.xml" --reporter-htmlextra-export "newman/report.html"

Allure report
 newman run SpriteCloudApi.postman_collection.json -e SpriteCloud.postman_environment.json -r allure --reporter-allure-export "directory"
 

HTML Report
 newman run SpriteCloudApi.postman_collection.json -e SpriteCloud.postman_environment.json -r htmlextra --reporter-htmlextra-export ./results/report.html
