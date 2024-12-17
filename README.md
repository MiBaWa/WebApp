# Web-basierte Anwendungssysteme

## Inhalt 

1. Übung:
    - BeanExample (Erstellung einer Bean)
    - BeanBeispielExtended (Erweiterung um Message Service)
    - BeanBeispielExtendedLogging (Logging in Spring Boot)
    - BeanBeispielExtendedTest (Testing in Spring Boot)
2. Übung
    - SpringIoC (Inversion of Control - Instanziierung, Setter-Methoden, @Autowired Annotationen)
    - SpringApplicationContext (Annotationen oder XML-Datei)
    - SpringBeanLifeCycle (LifeCycle States)
    - SpringCompleteBeanLifeCycle (Kompletter LifeCycle einer Bean)
    - SpringDependencyInjection (Dependency Injection - Field Injection, Constructor Injection, Setter Injection)
    - SpringScopes (Scopes: Singleton, Prototype, Request, Session)
3. Übung:
    - MVC (Model View Controller - Erste Web-Anwendung)
4. Übung:
    - RESTful-API (RESTful-API - Web-Anwendung mit RESTful API von CRUD über RESTful bis HATEOAS)
5. Übung:
    - GraphQL (GraphQL-Server - Web-Anwendung mit simpler GraphQL-API)
    - GraphQL-Client (GraphQL-Client - Einfacher Spring Boot-basierter GraphQL-Client)
    - GraphQL-Subscription (GraphQL-Server - Subscription für Live-Daten über WebSocket)
    - GraphQL-Client-Subscription (GraphQL-Client - Subscription von Realtime-Daten über WebSocket)
6. Übung:
    - gRPC (gRPC-Server - Web-Anwendung mit simpler gRPC-API)
    - gRPC-Client (gRPC-Client - Einfacher Spring Boot-basierter gRPC-Client)
    - gRPC-Streaming (gRPC-Server - Streaming mit gRPC: Client-seitig, Server-seitig und bidirektional)
    - gRPC-Client-Streaming (gRPC-Client - Streaming mit gRPC: Client-seitig, Server-seitig und bidirektional)
    gRPC-Client-UI zum Download [https://github.com/fullstorydev/grpcui/releases/tag/v1.4.1]
7. Übung:
    - ChatService (RESTful ChatService - Einfacher ChatService inkl. API Key-Erweiterung zur Authentifizierung)
    - UserService (RESTful UserService - Erweiterter UserService inkl. API Key-Erweiterung zur Authentifizierung)
8. Übung:
    - Angular (Angular - Einführung in Angular)
9. Übung:
    - PWA (Angular - Single Page Application (SPA) und Progressive Web App)

# Projektdokumentation

## Gliederung der Dokumentation
1. [Einführung](#einführung)
2. [Anforderungen und User Stories](#anforderungen-und-user-stories)
3. [Architektur des Systems](#architektur-des-systems)
4. [API Gateway](#api-gateway)
5. [Web Services](#web-services)
6. [Fehlerbehandlung](#fehlerbehandlung)
7. [Weitere Informationen](#weitere-informationen)

---

## Einführung
Das System besteht aus drei unabhängig voneinander implementierten Services.

- To-do-Service: Hier können To-dos erstellt, bearbeitet und gelöscht werden. Jeder To-do-Eintrag wird mit einer eindeutigen ID versehen.
- Status-Service: In diesem Service können Status erstellt, bearbeitet und gelöscht werden. Diese werden in einer Liste gespeichert
- User-Service: Dieser Service ermöglicht das Erstellen, Bearbeiten und Löschen von Nutzerprofilen. 
Alle Services sind so unabhängig voneinander einsetzbar

Das System bietet durch die Kombination seiner Services folgende Möglichkeiten:
- Jedem Nutzer können To-dos zugewiesen werden, die jeweils einen Status erhalten können. Eine übersichtliche Darstellung dieser Informationen ist über ein Dashboard abrufbar. 
- Die Ausführung aller Aufgaben erfolgt zentral über ein API-Gateway und entsprechende IDs.

Der Aufbau des Systems umfasst zwei Hauptbereiche:
- Übersichtsbereich: Hier wählt der Nutzer die gewünschten Inhalte zum anzeigen aus
- Servicebereich:  In diesem Bereich können To-dos erstellt, Status zugewiesen und neue Nutzer angelegt werden.



---

## Anforderungen und User Stories

### Anforderungen
- [Anforderung 1: Beschreibung der ersten Anforderung]
- [Anforderung 2: Beschreibung der zweiten Anforderung]
- [Anforderung 3: Beschreibung der dritten Anforderung]

### User Stories
1. **User Story 1**:  
   Als [Benutzer] möchte ich [alle To-Dos, Status und User in einer einzigen Schnittstelle sehen können], um [ein konsistentes und übersichtliches Erlebnis habe].  
   **Akzeptanzkriterien**:
   - [Kriterium 1]
   - [Kriterium 2]

2. **User Story 2**:  
   Als Benutzer möchte ich alle To-Dos, Status und User in einer einzigen Schnittstelle sehen können, um ein konsistentes und übersichtliches Erlebnis habe.  
   **Akzeptanzkriterien**:
   - [Kriterium 1]
   - [Kriterium 2]

---

## Architektur des Systems
[Hier kommt die Beschreibung der Systemarchitektur.]

### Grafische Darstellung der Architektur
![Diagramm](Dateipfad)

### Erläuterung der Architektur
- **API Gateway**:  
  [Kurze Beschreibung des API Gateways.]

- **Web Service 1**:  
  [Beschreibung von Web Service 1.]

- **Web Service 2**:  
  [Beschreibung von Web Service 2.]

- **Kommunikation zwischen den Komponenten**:  
  [Beschreibung der Kommunikation zwischen den Systemteilen.]

---

## API Gateway
[Die Inhalte aus der Datei `api-gateway-template.md` hier zusammenführen.]

- **Funktionalität**:  
  [Platzhalter für die Funktionalität des API Gateways.]

- **Endpoints**:  
  | No. | HTTP-Methode | URI                            | HTTP-Statuscode(s)                  | Consumes   | Produces |
  |-----|--------------|--------------------------------|-------------------------------------|------------|----------|
  | 1   | [GET/POST]   | [URI]                          | [Statuscodes]                       | [Format]   | [Format] |
  | 2   | [GET/POST]   | [URI]                          | [Statuscodes]                       | [Format]   | [Format] |

- **Konvertierungsvorschriften**:  
  [Beschreibung der Konvertierungsprozesse.]

---

## Web Services
[Die Inhalte aus der Datei `web-service-template.md` hier einfügen.]

### Web Service 1
- **Zweck**: [Beschreibung der Funktion des Services.]  
- **Endpoints**:  
  | No. | HTTP-Methode | URI              | HTTP-Statuscode(s)       | Consumes   | Produces |
  |-----|--------------|------------------|--------------------------|------------|----------|
  | 1   | [GET/POST]   | [URI]            | [Statuscodes]            | [Format]   | [Format] |

### Web Service 2
- **Zweck**: [Beschreibung der Funktion des Services.]  
- **Endpoints**:  
  | No. | HTTP-Methode | URI              | HTTP-Statuscode(s)       | Consumes   | Produces |
  |-----|--------------|------------------|--------------------------|------------|----------|
  | 1   | [GET/POST]   | [URI]            | [Statuscodes]            | [Format]   | [Format] |

---

## Fehlerbehandlung
[Hier die Fehlerbehandlung für API Gateway und Web Services zusammenführen.]

- **Fehler 400**: [Beschreibung des Fehlers, z.B. Ungültige Anfrage.]
- **Fehler 401**: [Beschreibung des Fehlers, z.B. Fehlende Authentifizierung.]
- **Fehler 500**: [Beschreibung des Fehlers, z.B. Interner Serverfehler.]

---

## Weitere Informationen
[Zusätzliche Informationen wie verwendete Technologien, Sicherheitsmaßnahmen oder Quellen.]

### Quellen
- [Quelle 1: Name oder Link der Quelle]
- [Quelle 2: Name oder Link der Quelle]


--
### Anforderungen
- **1. Zentrale Verwaltung und Übersicht:** Das System muss eine zentrale Schnittstelle bieten, die es dem Benutzer ermöglicht mit zwei Ansichten, To-Dos, Status und User anzuzeigen und zu verwalten.
- **2. Unabhängige Service-Integration:** Die Services (To-do-Service, Status-Service und User-Service) müssen so miteinander integriert werden, dass sie durch das API-Gateway zentral zugänglich sind, aber auch unabhängig voneinander betrieben werden können.
- **3. Benachrichtigungs- und Filtermechanismen:** Das System muss Benachrichtigungen über Änderungen an To-Dos sowie effektive Filtermöglichkeiten bieten, um den Benutzern einen schnellen Zugriff auf relevante Informationen zu ermöglichen.

### User Stories 
| **Als**     | **möchte ich**                                           | **weil/damit**                                   |
|-------------|----------------------------------------------------------|-------------------------------------------------|
| Benutzer    | alle To-Dos, Status und User in einer einzigen Schnittstelle sehen können | ich ein konsistentes und übersichtliches Erlebnis habe. |
| Benutzer    | To-Dos, User und Status zentral ansprechen können         | ich alles an einem Ort machen kann.             |
| Benutzer    | Usern To-Dos zuweisen können                              | die Verantwortung für Aufgaben klar festzulegen. |
| Benutzer    | To-Dos einen Status zuweisen können                       | ihre Bearbeitungsphase gekennzeichnet ist.       |
| Benutzer    | Filteroptionen nutzen können                              | ich schneller auf relevante Informationen zugreifen kann. |
| Benutzer    | die Möglichkeit haben, benachrichtigt zu werden, wenn ein User oder Status einer To-Do sich ändert | ich Änderungen bemerke und überwachen kann.      |
---
