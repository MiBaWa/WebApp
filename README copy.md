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
## Schnittstellendefinition
Bei der Schnittstelle zwischen dem To-Do-Service und dem API-Gateway haben wir uns für GraphQL entschieden.

### Warum GraphQL?

GraphQL wird für den To-Do-Service gewählt, da es mehrere Vorteile bietet, die den Anforderungen des Projekts entsprechen:

### 1. Flexibilität und Effizienz
GraphQL ermöglicht es, nur die benötigten Datenfelder abzufragen, wie z. B. `todo_name` und `status_ID`, ohne zusätzliche Informationen wie die vollständige Beschreibung eines To-Dos zu laden. Dadurch wird der Datenverkehr reduziert und die Performance verbessert.

- **Im Vergleich zu REST:**  
  REST liefert standardmäßig komplette Ressourcen. Selbst wenn nur bestimmte Felder benötigt werden, wird der gesamte Datensatz übertragen, was zu Overfetching führt.
- **Im Vergleich zu gRPC:**  
  gRPC bietet schnelle, binäre Kommunikation, aber die Protobuf-Schemas legen die Datenstruktur vorab fest, wodurch gezielte Teilabfragen weniger flexibel gestaltet werden können.


### 2. Optimierte Abfragen
GraphQL unterstützt gezielte Filtermechanismen, wie das Abrufen von To-Dos nach `user_ID` oder `status_ID`. Dies ermöglicht präzise und dynamische Abfragen.

- **Im Vergleich zu REST:**  
  REST kann Filter implementieren, erfordert jedoch oft zusätzliche Endpunkte, was den Prozess weniger dynamisch macht.
- **Im Vergleich zu gRPC:**  
  gRPC erfordert bei spezifischen Filteranfragen häufig Schema-Anpassungen, da die Flexibilität durch das feste Protobuf-Schema eingeschränkt ist.


### 3. Zukunftssicherheit und Erweiterbarkeit
GraphQL ermöglicht das Hinzufügen neuer Felder oder Funktionen, wie z. B. Prioritäten oder Tags, ohne bestehende Abfragen zu beeinflussen. Dies macht es ideal für modulare und erweiterbare Architekturen.

- **Im Vergleich zu REST:**  
  Neue Felder oder Funktionen erfordern oft neue Endpunkte, was zu einer Fragmentierung der API führen kann.
- **Im Vergleich zu gRPC:**  
  Änderungen am Schema können bestehende Clients beeinträchtigen, wenn diese nicht kompatibel sind.


### 4. Schnittstellenaufbau
Die Schnittstelle des To-Do-Services ist auf einem klar definierten GraphQL-Schema aufgebaut, das folgende Funktionen umfasst:
- **CRUD-Operationen:**  
  - `getToDos`: Abruf einer Liste von To-Dos.  
  - `getToDoByID`: Abruf eines spezifischen To-Dos anhand der `todo_ID`.  
  - `createToDo`, `updateToDo`, `deleteToDo`: Erstellung, Aktualisierung und Löschung von To-Dos.
- **Filtermechanismen:**  
  Flexible Abfragen, z. B. nach Benutzer (`user_ID`) oder Status (`status_ID`).

GraphQL übertrifft sowohl REST als auch gRPC in den Bereichen Flexibilität, Effizienz und Erweiterbarkeit. REST ist weniger dynamisch und liefert oft mehr Daten als benötigt, während gRPC zwar schnell ist, jedoch weniger flexibel bei gezielten Abfragen und Erweiterungen. GraphQL bietet die optimale Lösung für den To-Do-Service, da es präzise, leistungsstarke und erweiterbare Schnittstellen bereitstellt.

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
