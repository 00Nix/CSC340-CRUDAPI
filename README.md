# CSC340-CRUDAPI

# Link to Demo Video: https://uncg-my.sharepoint.com/personal/c_nix_uncg_edu/_layouts/15/stream.aspx?id=%2Fpersonal%2Fc%5Fnix%5Funcg%5Fedu%2FDocuments%2FCSC340%2DWorkspace%2FCalebNix%2DCRUD%5FAPI%20Presentation%2Emp4&startedResponseCatch=true&referrer=StreamWebApp%2EWeb&referrerScenario=AddressBarCopied%2Eview%2Eadd32c8e%2Dac24%2D4a75%2D912b%2D2a2f3c2c8afc

# Character CRUD API 

A comprehensive RESTful API for managing DC character records, built with Spring Boot, Spring Data JPA, and PostgreSQL. This project demonstrates fundamental concepts for building APIs with Spring Boot.

## API Endpoints

All endpoints use the base URL: `http://localhost:8080/api/characters`

### 1. Get All Characters

```http
GET /api/characters
```

**Description**: Retrieve a list of all characters in the database.

**Parameters**: None

#### Example Request

```bash
curl http://localhost:8080/api/characters
```

#### Example Response

```json
[
  {
    "characterId": 1,
    "name": "Batman",
    "description": "Superhero Crimefighter of Gotham",
    "universe": "DC",
    "power": "Intelligence",
    "species": "Human",
    "role": "Hero"
  },
  {
    "characterId": 2,
    "name": "Superman",
    "description": "Protector Of Metropolis",
    "universe": "DC",
    "power": "Super Strength",
    "species": "Kryptonian",
    "role": "Hero"
  }
]
```

---

### 2. Get Character by ID

```http
GET /api/characters/{id}
```

**Description**: Retrieve a character by their ID.

**Path Parameters**:

- `id` (Long, required): The unique identifier of the character

#### Example Request

```bash
curl http://localhost:8080/api/characters/1
```

#### Example Response

```json
{
    "characterId": 1,
    "name": "Batman",
    "description": "Superhero Crimefighter of Gotham",
    "universe": "DC",
    "power": "Intelligence",
    "species": "Human",
    "role": "Hero"
  }
```

#### Example Response if not found (Status: 404 Not Found)

```
(Empty body)
```

---

### 3. Create a New Character

```http
POST /api/characters/
```

**Description**: Create a new character record in the database.

**Request Body**: Character object with the following fields:

#### Example Request

```bash
{
  "name": "Flash",
  "description": "Fastest Man Alive",
  "universe": "DC",
  "power": "Super Speed",
  "species": "Human",
  "role": "Hero"
}
```

#### Example Response 

```json
{
  "characterId": 3,
  "name": "Flash",
  "description": "Fastest Man Alive",
  "universe": "DC",
  "power": "Super Speed",
  "species": "Human",
  "role": "Hero"
}
```

---

### 4. Update an Existing Character

```http
GET /api/characters/{id}
```

**Description**: Updates a characters by id.

**Path Parameters**:

- `id` : The id of the character to update

#### Example Request

```bash
{
    "name": "Batman",
    "description": "Superhero Crimefighter of Gotham",
    "universe": "DC",
    "power": "Infinite Wealth",
    "species": "Human",
    "role": "Hero"
  }
```

#### Example Response 

```json
{
  "characterId": 3,
  "name": "Batman",
  "description": "Superhero Crimefighter of Gotham",
  "universe": "DC",
  "power": "Infinite Wealth",
  "species": "Human",
  "role": "Hero"
}
```
---
---
### 5. Delete a Character

```http
DELETE /api/characters/{id}
```

**Description**: Deletes a character by id

**Path Parameters**:

- `id`: The id to delete 

#### Example Request

```bash
curl http://localhost:8080/api/characters/1
```

#### Example Request

```bash
curl -X DELETE http://localhost:8080/api/characters/1
```

#### Example Response (Status: 204 No Content)

```
(Empty body)
```

---

### 6. Search Characters by Name

```http
GET /api/characters/search?name={name}
```

**Description**: Search for characters by name

**Query Parameters**:

- `name`: The name to search for

#### Example Request

```bash
curl "http://localhost:8080/api/characters/search?name=Batman"
```

#### Example Response

```json
[
  {
    "name": "Batman",
    "description": "Superhero Crimefighter of Gotham",
    "universe": "DC",
    "power": "Intelligence",
    "species": "Human",
    "role": "Hero"
  }
]
```
---

### 7. Delete a Character

```http
DELETE /api/characters/{id}
```

**Description**: Delete an existing character from the database.

**Path Parameters**:

- `id`: The ID of the character to delete

#### Example Request

```bash
curl -X DELETE http://localhost:8080/api/characters/1
```

#### Example Response (Status: 204 No Content)

```
(Empty body)
```

---
