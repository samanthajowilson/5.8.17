var score = 0;
// reset is called from mu
function reset(){
   // reset images and score label on change
  hideElement("frowny_img");
  hideElement("trophy_img");
  setText("score_label", "");
}
// Add an if-else statement inside this event handler
onEvent("roll_btn", "click", function() {
  reset();
  var dieValue = randomNumber(1, 6);
  setText("diceRoll_label", dieValue);
  // if the guess is equal to dieValue 
  if (("dieValue") == 1) {
  showElement("trophy_img");
  score = score+6;
  } else {
  showElement("frowny_img");
  score = score - 1;
  }
  // else
  
  //update the score label to the new score.
  setText("score_label", score);
});
// You do not need to modify code below
onEvent("guess_dropdown", "change", function() {
  reset();
});
