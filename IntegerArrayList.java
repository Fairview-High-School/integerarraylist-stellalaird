public class IntegerArrayList implements IntegerList{
    
    private Integer[] data;
    private int size;

    public IntegerArrayList()
    {
        data = new Integer[10];
        size = 0;
    }

    public void add(Integer val)
    {
        if (size >= data.length)
        {
            Integer[] bigger = new Integer[2 * data.length];
            for (int i = 0; i < data.length; i++)
            {
                bigger[i] = data[i];
            }
            data = bigger;
        }
        data[size] = val;
        size++;
    }

    public void add(int index, Integer val)
    {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index);
        }
        if (size >= data.length)
        {
            Integer[] bigger = new Integer[2 * data.length];
            for (int i = 0; i < data.length; i++)
            {
                bigger[i] = data[i];
            }
            data = bigger;
        }
        for (int i = size - 1; i >= index; i--)
        {
            data[i + 1] = data[i];
        }
        data[index] = val;
        size++;
    }

    public void set(int index, Integer val)
    {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index);
        }
        data[index] = val;
    }

    public void clear()
    {
        size = 0;
    }

    public Integer remove(int index)
    {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index);
        }
        Integer removed = data[index];
        for (int i = index; i < size; i++)
        {
            data[i] = data[i + 1];
        }
        size--;
        return removed;
    }

    public Integer get(int index)
    {
        if (index < 0 || index >= size())
        {
            throw new IndexOutOfBoundsException("Index " + index);
        }
        return data[index];
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        if (size == 0)
        {
            return true;
        }
        return false;
    }

    public boolean contains(Integer val)
    {
        for (int i = 0; i < size; i++) {
            if (data[i] == val)
            {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Integer val)
    {
        for (int i = 0; i < size; i++)
        {
            if (data[i] == val)
            {
                return i;
            }
        }
        return -1;
    }
    
    public boolean equals(List<Integer> other)
    {
        if (other.size() != size)
        {
            return false;
        }
        if (size == 0 && other.size() == 0)
        {
            return true;
        }
        for (int i = 0; i < size; i++)
        {
            if (data[i].equals(other.get(i)) == false)
            {
                return false;
            }
        }
        return true;
    }

    public String toString()
    {
        String result = "[";
        if (size == 0){
            return result + "]";
        }
        for (int i = 0; i < size - 1; i++)
        {
            result += data[i] + ",";
        }
        result += data[size-1] + "]";
        return result;
    }
    
}
