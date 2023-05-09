package listesinifi;

//import java.util.ArrayList;
//import java.util.List;

import java.util.Arrays;

public class MyList<T> {

    private int capacity;
    private T[] mylist;
    // private List<T> mylist;

    public MyList() {
        setCapacity(10);
        mylist = (T[]) new Object[capacity];
        //mylist = new ArrayList<>(capacity);
    }

    public MyList(int capacity) {
        setCapacity(capacity);
        mylist = (T[]) new Object[capacity];
        //mylist = new ArrayList<>(capacity);
    }

    public int size() {
        int sayac = 0;
        for (T i : mylist) {
            if (i != null) {
                sayac++;
            }
        }
        return sayac;
    }

    public void add(T data) {

        if (this.size() == getCapacity()) {
            setCapacity(capacity * 2);
            T[] newlist = (T[]) new Object[capacity];
            for (int j = 0; j < mylist.length; j++) {
                newlist[j] = mylist[j];
            }
            for (int i = 0; i < newlist.length; i++) {
                if (newlist[i] == null) {
                    newlist[i] = data;
                    break;
                }
            }
            this.mylist = newlist;
        } else {
            for (int i = 0; i < mylist.length; i++) {
                if (mylist[i] == null) {
                    mylist[i] = data;
                    break;
                }
            }
        }
    }

    public T get(int index) {
        if (index > mylist.length - 1) {
            return null;
        }
        return mylist[index];
    }

    public void remove(int index) {
        if (index > mylist.length - 1) {
            System.out.println("null");
        }
        mylist[index] = (T) "";

        for (int i = index, j = index + 1; i < mylist.length && j < mylist.length; i++, j++) {
            mylist[i] = mylist[j];
        }
    }

    public void set(int index, T data) {
        if (index > mylist.length - 1) {
            System.out.println("null");
        }
        mylist[index] = data;
    }

    @Override
    public String toString() {

        String str = "";
        str += "[";
        int j = 1;

        for (T i : mylist) {
            if (i != null) {
                str += i;
                if (mylist[j] != null) {
                    str += ",";
                    j++;
                }
            }
        }
        str += "]";
        return str;
    }

    public int indexOf(T data) {
        for (int i = 0; i < mylist.length; i++) {
            if (mylist[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = mylist.length - 1; i >= 0; i--) {
            if (mylist[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        for (int i = 0; i < this.size(); i++) {
            if (mylist[i] != null) {
                return false;
            }
        }
        return true;
    }

    public T[] toArray() {
        T[] arr = (T[]) new Object[this.size()];
        for (int i = 0; i < this.size(); i++) {
            arr[i] = mylist[i];
        }
        return arr;
    }

    public void clear() {
        for (int i = 0; i < capacity; i++) {
            mylist[i] = null;
        }
    }

    public MyList<T> subList(int start, int finish) {

        MyList<T> arr = new MyList<>();
        int index = 0;
        for (int i = start; i <= finish; i++) {
            arr.mylist[index] = this.mylist[i];
            index++;
        }
        return arr;
    }

    public boolean contains(T data) {
        for (T i : mylist) {
            if (i == data) {
                return true;
            }
        }
        return false;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T[] getMylist() {
        return mylist;
    }

    public void setMylist(T[] mylist) {
        this.mylist = mylist;
    }
}
