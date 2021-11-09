package anu.dictionary;

import java.io.IOException;
import java.util.*;


public class Dictionary
{
    ArrayList<String> list = new ArrayList<>();
    List ls = new ArrayList<String>();
    boolean result;
    public boolean check(String word)
    {
        if(list.contains(word))
        {
            result = false;
        }
        else
        {
            result = true;
        }
        return result;
    }

    public boolean check1(String word)
    {
        if(list.contains(word))
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }


    public boolean addWord(String word)
    {
        check(word);
        list.add(word);
        return result;

    }

    public boolean removeWord (String word)
    {
            check1(word);
            list.remove(word);
            return result;
    }

    public  boolean  addWords(String[] words)
    {
        for(String word : words)
        {
            check1(word);
            addWord(word);
        }
        return result;
    }

    public boolean hasWord(String word)
    {

        check1(word);
        return result;
    }

    public String anyWord()
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

    public void listAllWords()
    {
        Collections.sort(list);
        System.out.println(list);
    }

    public String someWords(int size)
    {
        List ls = new ArrayList<String>();
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).length() == size)
            {
                ls.add(list.get(i));
            }
        }
        Collections.shuffle(ls);
        if(ls.isEmpty())
        {
            return null;
        }
        Random rand = new Random();
        return (String) ls.get(rand.nextInt(ls.size()));
    }

    public String anyWord(String prefix)
    {
        List ls = new ArrayList<String>();
        for(String s : list)
        {
            if(s.startsWith(prefix))
            {
                ls.add(s);
            }
        }
        Collections.shuffle(ls);
        if(ls.isEmpty())
        {
            return null;
        }
        Random rand = new Random();
        return (String) ls.get(rand.nextInt(ls.size()));

    }

    public String anyWord(String prefix, String suffix)
    {
        List ls = new ArrayList<String>();
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).startsWith(prefix) && list.get(i).endsWith(suffix))
            {
                ls.add(list.get(i));
            }
        }
        Collections.shuffle(ls);
        if(ls.isEmpty())
        {
            return null;
        }

        Random rand = new Random();
        return (String) ls.get(rand.nextInt(ls.size()));

    }

    public String allWords(String prefix)
    {
        List ls = new ArrayList<String>();
        for(String s : list)
        {
            if(s.startsWith(prefix))
            {
                ls.add(s);
            }
        }
        Collections.shuffle(ls);
        if(ls.isEmpty())
        {
            return null;
        }
        return ls.toString();
    }

    public String allWords(String prefix, String suffix)
    {
        List ls = new ArrayList<String>();
        for(String s : list)
        {
            if(s.startsWith(prefix) && s.endsWith(suffix))
            {
                ls.add(s);
            }
        }
        Collections.shuffle(ls);
        if(ls.isEmpty())
        {
            return null;
        }

        return ls.toString();
    }

    public String anySentence(int numberOfWords) throws IOException {

        List ls = new ArrayList<String>();
        for(String words : list)
        {
            String[] y = words.split(" ");
            int length = y.length;
           if(length == (numberOfWords))
           {
               ls.add(words);
           }
        }
        Collections.shuffle(ls);
        if(ls.isEmpty())
        {
            return null;
        }
        Random rand = new Random();
        return (String) ls.get(rand.nextInt(ls.size()));

    }

    public static void main(String[] args) throws IOException
    {
            Dictionary obj = new Dictionary();
            boolean addWord = obj.addWord("Anus");
            System.out.println("addWord : " + addWord);
            boolean removeWord = obj.removeWord("Saith");
            System.out.println("removeWord : " + removeWord);
            boolean  addWords = obj.addWords(new String[] {"Java is my favourite subject", "Apple", "There is some mistake in my code", "PineApple", "Zebra","Ant", "Tree"});
            System.out.println("addWords : " + addWords);
            boolean hasWord =  obj.hasWord("Anus");
            System.out.println("hasWord : " + hasWord);
            String anyWord = obj.anyWord();
            System.out.println("anyWord : " + anyWord);
            System.out.print("ListAllWords : ");
            obj.listAllWords();
            String someWords = obj.someWords(5);
            System.out.println("someWords : " + someWords);
            String anyWordPrefix = obj.anyWord("A");
            System.out.println("anyWordPrefix : " + anyWordPrefix);
            String allWordsPrefix = obj.allWords("A");
            System.out.println("allWordsPrefix : " + allWordsPrefix);
            String anyWordPrefixSuffix = obj.anyWord("A", "e");
            System.out.println("anyWordPrefixSuffix : " + anyWordPrefixSuffix);
            String allWordsPrefixSuffix = obj.allWords("T", "e");
            System.out.println("allWordsPrefixSuffix : " + allWordsPrefixSuffix);
            String anySentence = obj.anySentence(7);
            System.out.println("anySentence : " + anySentence);
    }
}




