package com.zaxxer.hikari.json;

import java.util.Collection;
import java.util.HashSet;

public class MenuBar
{
   public Menu menu;

   public static class Menu
   {
      public String id;
      public String value;
      public Popup popup;
   }

   public static class Popup
   {
      @JsonCollection(collectionClass = HashSet.class)
      public Collection<MenuItem> menuitem;
   }

   public static class MenuItem
   {
      public String value;
      public String onclick;
   }
}
