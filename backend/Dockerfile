FROM openjdk:17-slim

# Install Maven
RUN apt-get update --allow-unauthenticated && apt-get install -y maven

# Définir le répertoire de travail
WORKDIR /app

# Copier uniquement les fichiers nécessaires pour la compilation
COPY pom.xml .
COPY src ./src

# Télécharger les dépendances et compiler le projet
RUN mvn clean package -DskipTests

# Copier uniquement le fichier JAR compilé
COPY target/*.jar app.jar

# Définir la commande de lancement
CMD ["java", "-jar", "app.jar", "--spring.profiles.active=prod"]

# Exposer le port du backend
EXPOSE 2222
