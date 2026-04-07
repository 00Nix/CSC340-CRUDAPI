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
    <a href="/characters/index">Home</a>
    <a href="/characters/details">Character Details</a>
    <a href="/characters/about.">About</a>
    <a href="/characters/add">Add a Character</a>
</nav>
    <h1>The Justice League</h1>
    <div class="search-bar">
        <input type="text" id="searchInput" placeholder="Search by name..." onkeyup="searchCharacters()">
    </div>
    <div id="gallery">
        <#list index as character>
            <div class="card">
                <h3>${character.name}</h3>
                <p><strong>Universe:<strong> ${character.universe}</p>
                <p><strong>Role:</strong> ${character.role}</p> 
                <p><strong>Power</strong> ${character.power}</p>
                <p><strong>Species</strong> ${character.species}</p>   
                <a href="/characters/${character.characterId?c}" 
                style="display: inline-block;
                        margin-top: 10px;
                        padding: 8px 12px;
                        background-color: #60a5fa;
                        color: black;
                        text-decoration: none;
                        border-radius: 6px;">
                        View Details
                    </a>            
            </div>
        </#list>  
    </div>
</body>
</html>
 
