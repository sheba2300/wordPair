import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;
    public WordPairList(String[] words)
    {
        ArrayList <WordPair> p = new ArrayList<WordPair>();
        for(int x =0; x<words.length-1;x++)
        {
            for(int i =0;i<words.length; i++)
            {
                p.add(new WordPair(words[x],words[i]));
            }
        }
        allPairs =p;
    }
    public int numMartches()
    {
        int count =0;
        for(int i =0; i<allPairs.size();i++)
        {
            WordPair temp = allPairs.get(i);
            if(temp.getFirst().equals(temp.getSecond()))
            {
                count++;
            }
        }
        return count;
    }
}
