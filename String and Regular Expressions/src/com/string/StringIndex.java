package com.string;

public class StringIndex{

    private String word;

    public StringIndex(String word){
        this.word = word;
    }
    public void setWord(String word){
        this.word = word;
    }
    public String getWord(){
        return word;
    }
    public int indexOf(char character){
        char[] wordCharacter = getWord().toLowerCase().toCharArray();
        char[] wordCharacterCaps = getWord().toUpperCase().toCharArray();
        int characterIndex = 0;
        for(int i = 0; i < wordCharacter.length; i++){
            if(wordCharacter[i] == character || wordCharacterCaps[i] == character){
                characterIndex = i;
                break;
            }
            else{
                characterIndex = -1;
                System.out.println("Character not in word");
                break;
            }
        }
        return characterIndex;
    }
    public int lastIndexOf(char character){
        char[] wordCharacter = getWord().toLowerCase().toCharArray();
        char[] wordCharacterCaps = getWord().toUpperCase().toCharArray();
        int characterIndex = 0;
        for(int i = 0; i < wordCharacter.length; i++){
            if(wordCharacter[i] == character || wordCharacterCaps[i] == character){
                characterIndex = i;
            }
            else{
                characterIndex = -1;
                System.out.println("Character not in word");
                break;
            }
        }
        return characterIndex;
    }
}
