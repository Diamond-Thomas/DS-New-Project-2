public static void main(String[] args) {




    EditorHistory<String> editor = new EditorHistory<>();

    editor.makeChange("one");
    System.out.println(editor.peek());
    System.out.println("makes a new change");

    editor.makeChange("two");
    System.out.println(editor.peek());
    System.out.println("makes a new change");

    editor.makeChange("three");
    System.out.println(editor.peek());
    System.out.println("makes a new change");

    editor.undo();
    System.out.println(editor.peek());
    System.out.println("undoes one previous change");

    editor.undo();
    System.out.println(editor.peek());
    System.out.println("undoes one more previous change");

    editor.redo();
    System.out.println(editor.peek());
    System.out.println("redoes one previous change");

    editor.makeChange("four");
    System.out.println(editor.peek());
    System.out.println("makes a new change to branch off history");

    editor.redo();
    System.out.println(editor.peek());
    System.out.println("attempted redo");

}