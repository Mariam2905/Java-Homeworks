package org.example.homeworks.generics;

import java.util.ArrayList;
import java.util.List;

public class Library<T> {
    /**
     * 6.
     * This class acts as a library for the following kinds of media: book, video, and newspaper.
     * It uses generics and one that does not.
     * Feel free to use any additional APIs for storing and retrieving the media.
     */

    private List<T> mediaList;

    public Library() {
        this.mediaList = new ArrayList<T>();
    }

    public void addMedia(T media) {
        this.mediaList.add(media);
    }

    public T getMedia(int index) {
        if (index >= 0 && index < this.mediaList.size()) {
            return this.mediaList.get(index);
        } else {
            return null;
        }
    }

    public void removeMedia(int index) {
        if (index >= 0 && index < this.mediaList.size()) {
            this.mediaList.remove(index);
        }
    }

    public void clearMedia() {
        this.mediaList.clear();
    }

    public List<T> findMediaByType(Class<T> mediaType) {
        List<T> resultList = new ArrayList<T>();
        for (T media : this.mediaList) {
            if (mediaType.isInstance(media)) {
                resultList.add(media);
            }
        }
        return resultList;
    }
}
