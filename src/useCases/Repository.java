package useCases;

import entities.RegisteredUser;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Repository <RegisteredUser>{

    public List<entities.RegisteredUser> repository = new List<entities.RegisteredUser>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<entities.RegisteredUser> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(entities.RegisteredUser registeredUser) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends entities.RegisteredUser> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends entities.RegisteredUser> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public entities.RegisteredUser get(int index) {
            return null;
        }

        @Override
        public entities.RegisteredUser set(int index, entities.RegisteredUser element) {
            return null;
        }

        @Override
        public void add(int index, entities.RegisteredUser element) {

        }

        @Override
        public entities.RegisteredUser remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<entities.RegisteredUser> listIterator() {
            return null;
        }

        @Override
        public ListIterator<entities.RegisteredUser> listIterator(int index) {
            return null;
        }

        @Override
        public List<entities.RegisteredUser> subList(int fromIndex, int toIndex) {
            return null;
        }
    };



}
