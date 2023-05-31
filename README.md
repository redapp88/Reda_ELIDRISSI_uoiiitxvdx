# Reda_ELIDRISSI_uoiiitxvdx
Java Spring Test de Reda EL IDRISSI  
# Ressources
https://www.baeldung.com/  
https://github.com/redapp88
# Structure du projet
Package Entities : Les classes BO (business objects)  
Package DAO: data access objects  
Package domaine: les classes VO (value objects)  
Package converters: Les convertisseurs VO en BO et vice-versa  
Package services: les classes metiers implementant la logique fonctionelle  
Package web : les Controlleurs Rest de l'API  
# guide des tests fonctionels
Une authentification est necessaire pour pouvoir interagir avec l'api  
http://localhost:5000/login  
username=admin  
password=123456  
(utiliser une requête "POST" avec ces identifiants dans la partie "body")    
une fois la clé JWT recuperé en peut interagir correctement avec l'api /students
exemples:  
http://localhost:5000/students?size=2&page=0&teacherFullName=Jean DUPONT&className=CM1  
http://localhost:5000/students?size=2&page=0&className=CE2  
http://localhost:5000/students  
