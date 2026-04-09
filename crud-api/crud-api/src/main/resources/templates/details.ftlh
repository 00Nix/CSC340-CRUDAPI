<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Character Details | The Justice League</title>
    
<style>
body {
    font-family: Arial, sans-serif;
    margin: 0;
    background-color: #111827;
    color: white;
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
    color: white
}
.container {
    max-width: 900px;
    margin: 40px auto;
    background-color: #1f2937;
    border-radius: 10px;
    padding: 20px;
}
.character-image {
    width: 100%;
    border-radius: 10px;
    max-width: 500px;
    display: block;
    margin: 0 auto 30px auto;
}
h1 {
    text-align: center;
    color: #60a5fa;
}
.section {
    margin-bottom: 20px;
}
.section h2 {
    color: #60a5fa;
    margin-bottom: 10px;
}
.section h3 {
    color: #93c5fd;
    margin-bottom: 8px ;
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
<div class="container">
    <h1>${character.name}</h1>

    <#if character.imageUrl?has_content>
        <img src="${character.imageUrl}" alt="${character.name}" class="character-image">
    </#if>
    
    <div class="section">
        <h2>Character Details</h2>

        <div class="section">
            <h3>Biography</h3>
            <p>${character.description!""}</p>
        </div>

        <div class="section">
            <h3>Abilities</h3>
            <ul>
                <li><strong>Universe:</strong> ${character.universe!""}</li>
                <li><strong>Species:</strong> ${character.species!""}</li>
                <li><strong>Role:</strong> ${character.role!""}</li>
                <li><strong>Power:</strong> ${character.power!""}</li>
            </ul>
        </div>

        <div class="section">
            <h3>First Appearance</h3>
            <p>${character.firstAppearance!""}</p>
        </div>

        <div class="section">
            <h3>Personality Traits</h3>
            <p>${character.personalityTraits!""}</p>
        </div>

    </div>

    <a href="/characters/updateForm/${character.characterId?c}" style="
        display:inline-block;
        margin-top:10px;
        padding: 8px 12px;
        background-color: #60a5fa;
        color: black;
        text-decoration: none;
        border-radius: 6px;">
        Update Character
    </a>
    <a href="/characters/delete/${character.characterId?c}" style="
        display:inline-block;
        margin-top:10px;
        margin-left:10px;
        padding: 8px 12px;
        background-color: #ef4444;
        color: white;
        text-decoration: none;
        border-radius: 6px;">
        Delete Character
    </a>

</div>
</body>
</html>