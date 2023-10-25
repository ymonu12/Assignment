const prompt = require("prompt-sync")({ sigint: true });
let str = prompt("Enter Sentence");
let reversedSentence = reverseWords(str);
console.log(reversedSentence); 

function reverseWords(sentence) {
  let words = sentence.split(' ');
  let reversedWords = words.map(word => {
      let reversedWord = word.split('').reverse().join('');
      return reversedWord;
  });
  let reversedSentence = reversedWords.join(' ');

  return reversedSentence;
}