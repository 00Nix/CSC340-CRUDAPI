<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add a Character</title>
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
    max-width: 600px;
    margin: 40px auto;
    background-color: #1f2937;
    border-radius: 10px;
    padding: 20px;
}

h1 {
    text-align: center;
    color: #60a5fa;
    margin-bottom: 20px;
}
label {
    display: center;
    color: #60a5fa;
    margin-bottom: 20px;
}
input, textarea {
    width: 100%;
    padding: 10px;
    margin-bottom: 15px;
    border-radius: 6px;
    border: none;
    font-size: 16px;
    box-sizing: border-box;
}
textarea {
    resize: vertical;
}
button {
    background-color: #60a5fa;
    color: white;
    border: none;
    padding: 10px 20px;
    border-radius: 6px;
    font-size: 16px;
    cursor: pointer;
    font-weight: bold;
    margin-top: 20px;
}
button:hover {
    background-color: #3b82f6;
}
</style>
</head>
<body>
    <a href="/characters/index">Home</a>
    <a href="/characters/details">Character Details</a>
    <a href="/characters/about.">About</a>
    <a href="/characters/add">Add a Character</a>

<div class="container">
    <h1>Add a new Character</h1>
    <form action="/characters/save" method="post">
        <label for="name">Character Name:</label>
        <input type="text" id="name" name="name" placeholder="Enter character name" required>

        <label for="universe">Universe:</label>
        <input type="text" id="universe" name="universe": placeholder="Enter universe (e.g., DC, Marvel)" required>

        <label for="role">Role:</label>
        <input type="text" id="role" name="role" placeholder="Enter character role" required>

        <label for="species">Species:</label>
        <input type="text" id="species" name="species" placeholder="Enter species" required>

        <label for="power">Power:</label>
        <input type="text" id="power" name="power" placeholder="Enter character power" required>

        <label for="description">Biography:</label>
        <textarea id="text" id="description" name="description" rows="3" placeholder="Enter character description" required></textarea>

        <label for="firstAppearance">First Appearance:</label>
        <input type="text" id="firstAppearance" name="firstAppearance" placeholder="Enter characters first appearance" required>

        <label for="personalityTraits">Personality Traits</label>
        <textarea type="text" id="personalityTraits" name="Enter character traits" rows="2" placeholder="Enter character description" required></textarea>

        <button type="submit">Add Character</button>
    </form>
</div>
</body>
</html>

