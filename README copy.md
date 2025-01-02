# Web Service: [Name des Web Services]

## Funktionsbeschreibung
**Zweck**:  
Der To-Do-Service dient zur Verwaltung von Aufgaben. Benutzer können To-Dos erstellen, bearbeiten, löschen und anzeigen.

**Hauptfunktionen**:  
- Erstellung von neuen To-Dos.
- Bearbeitung bestehender To-Dos.
- Löschen von To-Dos.
- Abruf aller To-Dos in einer Liste.
- Abrufen einzelner To-Dos XD
- Verknüpfung von To-Dos mit Status und Benutzern über deren ID.

## Model-Attribute
Die folgenden Attribute beschreiben die Struktur des Modells dieses Web Services:

- **todo_ID:** Eindeutige ID des To-Dos.
- **todo_name:** Titel der Aufgabe.
- **todo_description:** Beschreibung der Aufgabe.
- **status_ID:** Verweis auf den zugehörigen Status.
- **user_ID:** Verweis auf den zugewiesenen Benutzer.

## Schnittstellendefinition
Bei der Schnittstelle zwischen dem To-Do-Serice und dem API-Gateway haben wir uns für GraphQL entschieden.

### **Warum GraphQL?**

GraphQL wird für den To-Do-Service gewählt, da es mehrere Vorteile bietet, die den Anforderungen des Projekts entsprechen:

#### Flexibilität und Effizienz
  - GraphQL ermöglicht es genau bzw. nur die benötigten Daten abzufragen, wodurch überflüssige Informationen vermieden und die Bandbreite reduziert wird.
  
     **Beispiel:** Benutzer können nur die todo_name- und status_ID-Felder eines To-Dos abfragen, ohne die vollständige To-Do-Beschreibung zu erhalten.

  - Dies reduziert den Datenverkehr und verbessert die Performance.
2. **Optimierte Abfragen**
  - GraphQL bietet eine einfache Möglichkeit, gezielte Filtermechanismen zu implementieren, wie z. B. das Abrufen von To-Dos nach User (user_ID) oder Status (status_ID).
3. **Zukunftssicherheit und Erweiterbarkeit**
  - Die Möglichkeit, Felder oder Funktionen hinzuzufügen, ohne bestehende Abfragen zu beeinflussen, macht GraphQL ideal für einen modularen Aufbau.
  - Wenn der To-Do-Service später erweitert wird, z. B. um Prioritäten oder Tags, können diese einfach ins Schema integriert werden, ohne bestehende Clients zu beeinträchtigen.

### Schnittstellenaufbau

1. **Datenmodell und Schema**
  - Die Schnittstelle basiert auf einem klar definierten Schema, das die Haupt-CRUD-Operationen (Create, Read, Update, Delete) für To-Dos abdeckt.
  - Zusätzlich können Filter und erweiterte Abfragen definiert werden, um spezifische Daten wie To-Dos eines bestimmten User oder mit einem bestimmten Status bereitzustellen.
2. **Filter und Mutationen**
  - **Abfragen (Queries):** Ermöglichen das Abrufen von To-Dos als Liste oder einzeln.

    **Beispiel:** 
      - getToDos: Abruf einer Liste von To-Dos.
      - getToDoByID: Abruf einer einzelnen To-Dos anhand von der todo_ID.
  - **Mutationen (Mutations):** Bieten Funktionen zur Erstellung, Aktualisierung und Löschung von To-Dos.
    
    **Beispiel:**
      - createToDo: Erstellung eines neuen To-Dos
      - updateToDo: Aktualisierung eines bestehenden To-Dos
      - deleteToDo: Löschung eines To-Dos anhand der ID.

  - **Filtermechanismen:** Unterstützen flexible Anfragen, z. B. nach Benutzer (user_ID) oder Status (status_ID).
    
    **Beispiel Query:** getToDos(filter: ToDoFilter): [ToDO!]!

GraphQL bietet dem To-Do-Service eine leistungsstarke, flexible und erweiterbare Schnittstelle, die sowohl aktuellen Anforderungen gerecht wird als auch Raum für zukünftige Erweiterungen lässt. Der Aufbau erfolgt modular und unterstützt eine effiziente und präzise Datenabfrage für alle Clients.

### API Endpoints

| No. | HTTP-Methode | URI                            | HTTP-Statuscode(s)                  | Consumes   | Produces |
|-----|--------------|--------------------------------|-------------------------------------|------------|----------|
| 1   | [GET/POST]   | `/api/v1/[endpoint]`           | [Statuscodes]                       | [Datenformat] | [Datenformat] |
| 2   | [GET/POST]   | `/api/v1/[endpoint2]`          | [Statuscodes]                       | [Datenformat] | [Datenformat] |

## User Stories

| **Als...**    | **möchte ich...**                        | **damit/weil/denn...**                                      |
|----------|----------------------------|-------------------------------------------------------------|
| Benutzer | To-Dos erstellen können | ich meine Aufgaben organisieren kann.                             |
| Benutzer | bestehende To-Dos bearbeiten können | ich Inhalte und Details bei Bedarf aktualisieren kann.|
| Benutzer | To-Dos löschen können | ich nicht mehr benötigte Aufgaben entfernen kann.                   |
| Benutzer | alle To-Dos in einer Liste sehen | ich alles auf einen Blick sehen kann. |
| Benutzer | mir nur bestimmte To-Dos anzeigen lassen können | ich schneller relevante Informationen dazu bekomme. |

## Fehlerbehandlung
- **Fehler 400**: [Beschreibung des Fehlers]
- **Fehler 500**: [Beschreibung des Fehlers]

## Weitere Informationen
[Zusätzliche Informationen oder Hinweise, die für diesen Web Service wichtig sind.]
