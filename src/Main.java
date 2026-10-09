public static void main(String[] args) {




    EditorHistory<String> editor = new EditorHistory<>();

    editor.makeChange("one");
    System.out.println(editor.peek());

    editor.makeChange("two");
    System.out.println(editor.peek());

    editor.makeChange("three");
    System.out.println(editor.peek());

    editor.undo();
    System.out.println(editor.peek());


    editor.redo();
    System.out.println(editor.peek());


}