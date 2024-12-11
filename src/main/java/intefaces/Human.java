package intefaces;


import entities.Entity;
import entities.Event;
import entities.Item;
import entities.Raft;
import entities.Ship;
import stats.Place;
import stats.RaftStats;
import stats.Unions;

public interface Human {
    String think();
    String think(String thought);

    String pickUp();
    String pickUp(Item item);

    String solve();
    String solve(String solution);

    String go(String message, Place place, boolean future);

    String know();
    String know(String thought);

    String carry(Unions union, Place place);
    String carry(Unions unions, Place place, Raft raft);

    String became();

    String hold();
    String hold(Item item);

    String bring(String context, Entity entity);
    String bring(String context, Place place);

    String wait(String message, Event event);

    String undress();
    String undress(Item... items);

    String climb(Place place);

    String build(Raft raft);

    String make(String message, Raft raft, RaftStats... raftStats);

    String upload(Ship ship, Raft raft, Item... items);
    String upload(Raft raft, Place place);

    String notEnoughStrength();

    String pullDown();

    String found();
}
