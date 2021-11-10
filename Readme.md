# Compte Rendu TP INFO 706

On peut:
- ajouter des colis
- supprimer des colis
- modifier des colis (position)
- voir l'etat des colis

Les colis sont enregistré dans une base de données et représenté par une entité JPA.

Un EJB statless sert de facade pour les differente interaction avec l'application.

## Technologie

Nous avons utilsé wildfly24 et java16.
Nous utilison une entité jpa pour representer les colis ainsi q'un ejb pour les manipuler.
Il y a 4 servlet:
 - Delete, suprime un colis
 - Progression, permet de suivre les colis
 - Register, permet d'ajouter des colis
 - Update, permet de modifier des colis

## Utilisation

lancer le projet sur un server
Se rendre a l'adresse 'localhost:8080/<nom_du_projet>/'
deux options:
    - enregistrer un nouveau colis
    - voir la liste des colis:
        - suprimer un colis
        - modifier l'etat d'un colis
