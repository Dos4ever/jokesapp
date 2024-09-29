package com.jokes.jokesapp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

    @GetMapping("/welcome")
    public String getTable() {

        // Creating an HTML table with a form to add jokes and cities, along with CSS
        String table = "<html>" +
            "<head>" +
            "<style>" +
            "table { " +
            "  width: 50%; " + 
            "  margin: 50px auto; " +  
            "  border-collapse: collapse; " +  
            "  text-align: center; " +  
            "  font-family: Arial, sans-serif; " + 
            "  background-color: #f9f9f9; " +  
            "}" +
            "th, td { " +
            "  padding: 10px; " +  
            "  border: 2px solid #ddd; " + 
            "}" +
            "th { " +
            "  background-color: #4CAF50; " +  
            "  color: white; " +  
            "}" +
            "tr:nth-child(even) { " +  
            "  background-color: #f2f2f2; " +
            "}" +
            "tr:hover { " +  
            "  background-color: #ddd; " +
            "}" +
            "form { " +
            "  margin: 20px auto; " + 
            "  text-align: center; " +
            "}" +
            "input[type='text'] { " +
            "  padding: 10px; " +
            "  width: 200px; " +
            "  margin: 5px; " +
            "  border: 2px solid #ddd; " +
            "}" +
            "button { " +
            "  padding: 10px 20px; " +
            "  background-color: #4CAF50; " +
            "  color: white; " +
            "  border: none; " +
            "  cursor: pointer; " +
            "}" +
            "button:hover { " +
            "  background-color: #45a049; " +
            "}" +
            "</style>" +
            "</head>" +
            "<body>" +
            "<table id='jokeTable'>" +
            "<tr><th>City</th><th>Joke</th></tr>" + 
            "<tr><td>New York</td><td>Why don’t scientists trust atoms? Because they make up everything!</td></tr>" +
            "<tr><td>Tokyo</td><td>Why don’t skeletons fight each other? They don’t have the guts.</td></tr>" +
            "<tr><td>London</td><td>I told my wife she was drawing her eyebrows too high. She looked surprised.</td></tr>" +
            "<tr><td>Paris</td><td>Why don't some couples go to the gym? Because some relationships don’t work out.</td></tr>" +
            "<tr><td>Shanghai</td><td>I would tell you a construction joke, but I’m still working on it.</td></tr>" +
            "<tr><td>Mumbai</td><td>What do you call fake spaghetti? An impasta!</td></tr>" +
            "<tr><td>São Paulo</td><td>Why did the scarecrow win an award? Because he was outstanding in his field!</td></tr>" +
            "<tr><td>Los Angeles</td><td>I invented a new word! Plagiarism!</td></tr>" +
            "<tr><td>Cairo</td><td>Why did the bicycle fall over? It was two tired!</td></tr>" +
            "<tr><td>Lagos</td><td>What’s orange and sounds like a parrot? A carrot!</td></tr>" +
            "<tr><td>Moscow</td><td>What did one ocean say to the other ocean? Nothing, they just waved.</td></tr>" +
            "<tr><td>Seoul</td><td>I'm reading a book on anti-gravity. It's impossible to put down!</td></tr>" +
            "<tr><td>Mexico City</td><td>Did you hear about the mathematician who’s afraid of negative numbers? He will stop at nothing to avoid them!</td></tr>" +
            "<tr><td>Istanbul</td><td>Parallel lines have so much in common. It’s a shame they’ll never meet.</td></tr>" +
            "</table>" +
            
            // Form for adding new jokes
            "<form onsubmit='addJoke(event)'>" +
            "<input type='text' id='cityInput' placeholder='Enter city name' required />" +
            "<input type='text' id='jokeInput' placeholder='Enter your joke' required />" +
            "<button type='submit'>Add Joke</button>" +
            "</form>" +

            // JavaScript to handle form submission and add rows to the table dynamically
            "<script>" +
            "function addJoke(event) {" +
            "  event.preventDefault();" +  // Prevent form from refreshing the page
            "  const city = document.getElementById('cityInput').value;" +
            "  const joke = document.getElementById('jokeInput').value;" +
            "  const table = document.getElementById('jokeTable');" +
            "  const newRow = table.insertRow();" +  // Create a new row
            "  const cityCell = newRow.insertCell(0);" +  // Create a new cell for city
            "  const jokeCell = newRow.insertCell(1);" +  // Create a new cell for joke
            "  cityCell.textContent = city;" +  // Set city name
            "  jokeCell.textContent = joke;" +  // Set joke text
            "  document.getElementById('cityInput').value = '';" +  // Clear the input fields
            "  document.getElementById('jokeInput').value = '';" +
            "}" +
            "</script>" +
            "</body>" +
            "</html>";
        
        return table;  // Return the formatted table with form and JavaScript functionality
    }
}
