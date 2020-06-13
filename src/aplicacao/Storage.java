package aplicacao;

import java.util.ArrayList;

import music.Musica;

public abstract class Storage<T> {
    private ArrayList<T> items;
  

    protected Storage() {
        this.items = new ArrayList<T>();
    }

    protected void add(T item) {
        items.add(item);
    }

    protected void remove(T item) {
        items.remove(item);
    }

    protected ArrayList<T> getItems() {
        return items;
    }
    

    
}
