<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>The Justice League | Character Gallery</title>

    <style>
body {
    font-family: Arial, sans-serif;
    margin: 0;
    background-color: #111827;
    color: white;
}

h1 {
    text-align: center;
    padding: 20px;
}
nav {
    background-color: #1f2937;
    padding: 15px;
    text-align: center;
}
nav a {
    color: #60a5fa;
    text-decoration: none;
    font-weight: bold;
    margin: 0 15px;
}
nav a:hover {
    color: white;
}
.toolbar {
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 15px;
    padding: 15px 20px;
}

.search-container {
    text-align: center;
    margin-bottom: 20px;
}

#searchInput {
    padding: 10px;
    width: 300px;
    border-radius: 6px;
    border: none;
    font-size: 16px;
}
.btn {
    display: inline-block;
    padding: 8px 14px;
    border-radius: 6px;
    text-decoration: none;
    font-weight: bold;
    font-size: 14px;
}
.btn-blue {
    background-color: #60a5fa;
    color: black; }
.btn-green {
    background-color: #22c55e;
    color: black;
}
.btn-red {
    background-color: #ef4444;
    color: white;
}

#gallery {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
    gap: 20px;
    padding: 20px;
}

.card {
    background-color: #1f2937;
    border-radius: 10px;
    padding: 15px;
    text-align: center;
    transition: transform 0.3s ease;
}

.card:hover {
    transform: scale(1.05);
}

.card img {
    width: 100%;
    border-radius: 8px;
}

.card h3 {
    margin: 10px 0 5px 0;
    color: #60a5fa;
}

.card p {
    margin: 4px 0;
    font-size: 14px;
}
</style>
</head>

<body>
<nav>
    <a href="/characters/character-list">Home</a>
    <a href="/characters/details">Character Details</a>
    <a href="/characters/about">About</a>
    <a href="/characters/add">Add a Character</a>
</nav>
    <h1>The Justice League</h1>
    <div class="toolbar">
        <form action="/characters/search" method="get">
        <input type="text" id="searchInput" name="name" placeholder="Search by name...">
        <button type="submit" class="btn btn-blue">Search</button>
        </form>
        <a href="/characters/add" class="btn btn-green">+ Create New Charcter</a>
    </div>
    <div id="gallery">
        <#list characterList as character>
            <div class="card">
                <#if character.imageUrl?has_content>
                <img src="${character.imageUrl}"
                alt="${character.name}">
                </#if>
                <h3>${character.name}</h3>
                <p><strong>Universe:</strong> ${character.universe}</p>
                <p><strong>Role:</strong> ${character.role}</p> 
                <p><strong>Power:</strong> ${character.power}</p>
                <p><strong>Species:</strong> ${character.species}</p>   
                <a href="/characters/${character.characterId?c}" class="btn btn-blue">
                    View Details
                </a>
                <a href="/characters/updateForm/${character.characterId?c}" class="btn btn-blue"
                style="margin-left: 6px;">
                         Update
                    </a>
                <a href="/characters/delete/${character.characterId?c}" class="btn btn-red"
                style="margin-left: 6px;">
                Delete            
            </a>
            </div> 
        </#list>
    </div> 
</body>
</html>
 
