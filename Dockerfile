# Temel imaj
FROM eclipse-temurin:21-jdk

# Çalışma dizini oluştur
WORKDIR /app

# Bağımlılıkları önceden kopyala ve indir
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
RUN ./mvnw dependency:go-offline -B

# Tüm projeyi kopyala
COPY . .

# Uygulamayı derle
RUN ./mvnw clean package -DskipTests

# Uygulama jar'ını çalıştır
CMD ["java", "-jar", "target/backend-0.0.1-SNAPSHOT.jar"]
