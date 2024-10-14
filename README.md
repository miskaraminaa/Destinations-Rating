# DestinationsRating - Android Application

## Description

**DestinationsRating** est une application mobile Android qui permet aux utilisateurs de découvrir et de noter différentes destinations touristiques. L'application utilise un **RecyclerView** pour afficher la liste des destinations avec des options de filtrage et des animations pour améliorer l'expérience utilisateur. L'application inclut également un écran de démarrage animé et des images circulaires pour un design élégant.

## Fonctionnalités

- **Écran de démarrage animé** : L'application démarre avec un écran de bienvenue animé incluant le logo avec un effet de filtrage.
- **RecyclerView** : Affichage fluide d'une liste de destinations touristiques avec un **RecyclerView**.
- **Filtrage des données** : Possibilité de filtrer les destinations par nom ou d'autres critères.
- **Menu de navigation** : Accès simplifié aux fonctionnalités principales de l'application via un menu.
- **Images circulaires** : Utilisation de **CircleImageView** pour afficher les images des destinations sous forme circulaire.
- **Animations** : Intégration d'animations sur le logo et d'autres éléments de l'interface utilisateur pour une expérience plus interactive.
- **Bibliothèque Glide** : Chargement et gestion efficace des images grâce à la bibliothèque **Glide**.

## Installation

1. Clonez ce dépôt GitHub :
   ```bash
   git clone https://github.com/miskaraminaa/DestinationsRating_RecycleView.git
dependencies {
    // RecyclerView pour afficher les listes de données
    implementation 'androidx.recyclerview:recyclerview:1.2.1'

    // CircleImageView pour afficher des images circulaires
    implementation 'de.hdodenhof:circleimageview:3.1.0'

    // Glide pour charger les images
    implementation 'com.github.bumptech.glide:glide:4.12.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
    
    // Autres dépendances nécessaires
    implementation 'androidx.appcompat:appcompat:1.3.1'
    implementation 'com.google.android.material:material:1.4.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.0'
}
### Screenshots
Voici quelques captures d'écran de l'application :
![Capture d'écran 2024-10-12 133027](https://github.com/user-attachments/assets/2337403d-efcb-4791-9dc5-b864554fb852)
![Capture d'écran 2024-10-12 133008](https://github.com/user-attachments/assets/d620313c-a5a1-40fe-81d9-8a3bf613b221)
![Capture d'écran 2024-10-12 133157](https://github.com/user-attachments/assets/0f1d7538-f2eb-4bbd-a27c-9b31f37e2e84)
![Capture d'écran 2024-10-12 133055](https://github.com/user-attachments/assets/462b1f3d-7d4d-4cd3-8150-155e9c22585b)


### Demo video

https://github.com/user-attachments/assets/aa78854f-d136-4862-a182-458b5c80531c

