package com.example.universalbooks.modelclass;

public class DurgaStuti {
    int image;
    String id,name;

    public DurgaStuti(int image, String id, String name) {
      this.setImage(image);
      this.setId(id);
      this.setName(name);
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
