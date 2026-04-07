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
</style>
</head>

<body>
<nav>
    <a href="/characters/index">Home</a>
    <a href="/characters/details">Character Details</a>
    <a href="/characters/about.">About</a>
    <a href="/characters/add">Add a Character</a>
</nav>
<div class="container">
    <h1>${character.name}</h1>
    
    <img src="batman2.jpg" alt="Batman" class="character-image">
    
    <div class="section">
        <h2>Biography</h2>
        <p>${character.description}</p>
    </div>

    <div class="section">
        <h2>Abilities</h2>
        <ul>
            <li>Intelligence</li>
            <li>Combat Skills</li>
            <li>Unlimited Wealth</li>
            <li>Peak Human Condition</li>
            <li>Stealth and Agility</li>
        </ul>
    </div>

    <div class="section">
        <h2>First Appearance</h2>
        <p>${character.firstAppearance}</p>
    </div>

    <div class="section">
        <h2>Personality Traits</h2>
        <p>${character.personalityTraits}</p>
    </div>
</div>
</html>