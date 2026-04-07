Cahier des charges – EasyBarber
1. Introduction
1.1 Présentation du projet
Le projet EasyBarber consiste en la conception et le développement d’une application web de gestion des rendez-vous pour un barber shop fictif.
Cette application permettra aux clients de réserver des créneaux en ligne et à l’administrateur de gérer efficacement les services et les réservations.
1.2 Contexte
Dans un barber shop traditionnel, la gestion des rendez-vous se fait souvent de manière manuelle (téléphone ou sur place), ce qui peut entraîner des erreurs, des conflits d’horaires et une perte de temps.
EasyBarber vise à digitaliser ce processus afin d’améliorer l’organisation et l’expérience client.
1.3 Objectifs
L’objectif principal est de développer une application web sécurisée permettant :
•	La gestion des utilisateurs (clients et administrateurs)
•	La réservation de rendez-vous en ligne
•	La gestion des services proposés
•	L’évitement des conflits de réservation

2. Périmètre du projet
2.1 Utilisateurs concernés
Client
•	Créer un compte
•	Se connecter
•	Consulter les services
•	Réserver un rendez-vous
•	Consulter ses rendez-vous
•	Annuler un rendez-vous
Administrateur
•	Se connecter
•	Gérer les services (ajout, modification, suppression)
•	Consulter tous les rendez-vous
•	Gérer les disponibilités

3. Besoins fonctionnels
3.1 Gestion des utilisateurs
•	Inscription avec email et mot de passe
•	Authentification sécurisée
•	Gestion des rôles (client / administrateur)
3.2 Gestion des services
•	Affichage des services disponibles
•	Ajout, modification et suppression des services (admin uniquement)
•	Informations : nom, description, durée, prix
3.3 Gestion des rendez-vous
•	Réservation d’un créneau par un client
•	Sélection de la date et de l’heure
•	Association à un service
•	Annulation d’un rendez-vous
•	Consultation des rendez-vous
3.4 Règles de gestion
•	Un utilisateur doit être authentifié pour réserver
•	Un créneau horaire ne peut pas être réservé plusieurs fois
•	Un client ne peut voir que ses propres rendez-vous
•	L’administrateur peut voir tous les rendez-vous

4. Besoins non fonctionnels
4.1 Sécurité
•	Protection des données utilisateurs
•	Authentification sécurisée
•	Gestion des accès selon les rôles
4.2 Performance
•	Temps de réponse rapide
•	Gestion efficace des requêtes
4.3 Ergonomie
•	Interface simple et intuitive
•	Navigation fluide
4.4 Maintenabilité
•	Code structuré et documenté
•	Architecture claire (frontend / backend / base de données)

5. Architecture technique
L’application repose sur une architecture multicouche composée de :
•	Frontend : interface utilisateur (React)
•	Backend : API REST (Spring Boot)
•	Base de données : MySQL
Cette architecture permet une séparation claire des responsabilités et facilite la maintenance et l’évolution du projet.

6. Modélisation des données
6.1 Entités principales
Utilisateur (User)
•	id
•	nom complet
•	email
•	mot de passe
•	rôle
Service
•	id
•	nom
•	description
•	durée
•	prix
Rendez-vous (Appointment)
•	id
•	date
•	heure
•	statut
•	utilisateur associé
•	service associé
6.2 Relations
•	Un utilisateur peut avoir plusieurs rendez-vous
•	Un service peut être associé à plusieurs rendez-vous

7. Contraintes
•	L’application doit empêcher les conflits de réservation
•	Les données doivent être validées avant enregistrement
•	Les accès doivent être sécurisés
•	L’application doit être testable et déployable

8. Livrables attendus
•	Application web fonctionnelle
•	Code source du projet
•	Base de données
•	Documentation technique
•	Cahier des charges
•	Support de présentation





9. Planning prévisionnel
Étape	Description
Analyse	Définition des besoins
Conception	Modélisation base de données
Développement backend	API + logique métier
Développement frontend	Interfaces utilisateur
Tests	Validation des fonctionnalités
Déploiement	Mise en production
Présentation	Soutenance devant jury

10. Conclusion
Le projet EasyBarber vise à répondre à un besoin réel de digitalisation des rendez-vous dans un barber shop.
Il met en œuvre des compétences en développement web, en conception d’architecture et en gestion de base de données, tout en intégrant des notions de sécurité et de qualité logicielle.

