public static void main(String[] args) {




    EditorHistory<String> editor = new EditorHistory<>();

    /* editor.makeChange("one");
    editor.makeChange("two");
    editor.makeChange("three"); */

    editor.undo();
    System.out.println(editor.peek());

}