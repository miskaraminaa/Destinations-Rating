# DestinationsRating - Android Application

## Description

**DestinationsRating** est une application mobile Android qui permet aux utilisateurs de découvrir et noter différentes destinations touristiques. L'application utilise un **RecyclerView** pour afficher la liste des destinations, avec des options de filtrage et d'animation pour améliorer l'expérience utilisateur. L'application inclut également un écran de démarrage animé et une gestion des images circulaires.

## Fonctionnalités

- **Écran de démarrage animé** : L'application démarre avec un écran de bienvenue animé qui affiche un logo avec un effet de filtrage.
- **RecyclerView** : Utilisation d'un **RecyclerView** pour afficher une liste de destinations touristiques, permettant de scroller facilement à travers les éléments.
- **Filtrage des données** : Les utilisateurs peuvent filtrer les destinations par nom ou autre critère.
- **Menus** : Un menu de navigation pour accéder aux différentes fonctionnalités de l'application.
- **Images circulaires** : Utilisation de **CircleImageView** pour afficher les images des destinations sous forme circulaire.
- **Animations** : Intégration d'animations diverses sur le logo et d'autres éléments UI pour rendre l'application plus fluide et interactive.
- **Bibliothèque Glide** : Chargement et gestion efficace des images avec la bibliothèque **Glide**.

## Dépendances

L'application utilise les dépendances suivantes pour assurer son bon fonctionnement :

```groovy
dependencies {
    // RecyclerView
    implementation 'androidx.recyclerview:recyclerview:1.2.1'
    
    // CircleImageView for circular images
    implementation 'de.hdodenhof:circleimageview:3.1.0'
    
    // Glide for image loading
    implementation 'com.github.bumptech.glide:glide:4.12.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
    
![Capture d'écran 2024-10-12 133055](https://github.com/user-attachments/assets/7b6ac464-c0cd-4a59-a79c-42074c61f5c3)
![Capture d'écran 2024-10-12 133027](https://github.com/user-attachments/assets/286353cd-b8a0-4f3b-8100-823dfc2462f6)
![Capture d'écran 2024-10-12 133008](https://github.com/user-attachments/assets/6157ba0d-2bca-4fb3-879c-b33008cbb491)
![Capture d'écran 2024-10-12 133157](https://github.com/user-attachments/assets/54fdfd6d-3814-4845-b896-f96f47ab3972)



https://github.com/user-attachments/assets/d17b5171-49a3-4993-82bc-b2a5f08e3a13

