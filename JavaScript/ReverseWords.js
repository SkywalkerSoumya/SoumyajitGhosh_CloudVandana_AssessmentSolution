function reverseWordsInOrder(sentence) {
    // spliting each word from the sentence and storing it
    const words = sentence.split(' ');

    // reversing each word and creating an array to store them
    const reversedWords = words.map(word => word.split('').reverse().join(''));

    // Joining the reversed words and returning the new sentence
    return reversedWords.join(' ');
}
// Taking a sample input to test
const input = "iH , I epoH uoY era gniod llew !";
console.log(reverseWordsInOrder(input));
