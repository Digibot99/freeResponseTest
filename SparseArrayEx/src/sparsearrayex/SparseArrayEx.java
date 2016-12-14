//Below is the output
//
//0 0 0 0 0 
//0 5 0 0 4 
//1 0 0 0 0 
//0 -9 0 0 0 
//0 0 0 0 0 
//0 0 0 0 0 
//=============
//0 0 0 0 
//0 0 0 4 
//1 0 0 0 
//0 0 0 0 
//0 0 0 0 
//0 0 0 0 

package sparsearrayex;
import java.util.*;

public class SparseArrayEx {

    public static void main(String[] args) {
        SparseArray sparseArray = new SparseArray(6,5);
        
        sparseArray.add(new SparseArrayEntry(1,4,4));
        sparseArray.add(new SparseArrayEntry(2,0,1));
        sparseArray.add(new SparseArrayEntry(3,1,-9));
        sparseArray.add(new SparseArrayEntry(1,1,5));

        for (int r = 0;r < sparseArray.getNumRows();r++)
        {
            for (int c = 0;c < sparseArray.getNumCols();c++)
            {
                System.out.print(sparseArray.getValueAt(r, c) + " ");
            }
            System.out.println("");
        }
        System.out.println("=============");
        
        sparseArray.removeColumn(1);

        for (int r = 0;r < sparseArray.getNumRows();r++)
        {
            for (int c = 0;c < sparseArray.getNumCols();c++)
            {
                System.out.print(sparseArray.getValueAt(r, c) + " ");
            }
            System.out.println("");
        }
        
    }
}
class SparseArray
{
    private int numRows;
    private int numCols;
    private List<SparseArrayEntry> entries;
    
    public SparseArray()
    {
        entries = new ArrayList<SparseArrayEntry>();
    }
    public SparseArray(int _numRows, int _numCols)
    {
        numRows = _numRows;
        numCols = _numCols;
        entries = new ArrayList<SparseArrayEntry>();
    }
    public void add(SparseArrayEntry entry)
    {
        entries.add(entry);
    }
    
    public int getNumRows()
    {
        return (numRows);
    }
    public int getNumCols()
    {
        return (numCols);
    }
    public int getValueAt(int row, int col)
    {
        for (int i = 0; i < entries.size(); i++)
        {
            if (entries.get(i).getRow() == row)
            {
                if (entries.get(i).getCol() == col)
                {
                    return(entries.get(i).getValue());
                }
            }
        }
        return(0);
    }
    public void removeColumn(int col)
    {
        for (int i = 0; i < entries.size(); i++)
        {
            if (entries.get(i).getCol() == col)
            {
                 entries.remove(i);
                 
                 if (entries.get(i).getCol() > col)
                    {
                        int row = entries.get(i).getRow();
                        int column = entries.get(i).getCol();
                        int value = entries.get(i).getValue();
                        entries.remove(i);
                        entries.add(new SparseArrayEntry(row,column - 1,value));
                    }
            }
        }
    }
    
    
}
class SparseArrayEntry
{
    private int row;
    private int col;
    private int value;
    
    public SparseArrayEntry(int r, int c, int v)
    {
        row = r;
        col = c;
        value = v;
    }
    public int getRow()
    {
        return (row);
    }
    public int getCol()
    {
        return (col);
    }
    public int getValue()
    {
        return (value);
    }    
    
}
