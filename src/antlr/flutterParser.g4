//parser grammar flutterParser;
//options { tokenVocab=dartLexer ; }
//prog : widgets* ;
//widgets:textField|image|row|column|container|listView ;
//
////////////////textfield//////////
//textField
//    : TEXTFIELD_ '(' (textFieldProperties ',')+ ')'
//    ;
//
//textFieldProperties
//    : textFieldTextProperty
//    | textFieldControllerProperty
//    | textFieldDecorationProperty
//    | textFieldOnChangedProperty
//    ;
//
//textFieldTextProperty
//    : TEXT_ ':' SingleLineString
//    ;
//
//textFieldControllerProperty
//    : CONTROLLER_ ':' IDENTIFIER
//    ;
//
//textFieldDecorationProperty
//    : DECORATION_ ':' INPUTDECORATION_ '(' (inputDecorationProperties)+ ')'
//    ;
//
//inputDecorationProperties
//    : inputDecorationLabelTextProperty
//    | inputDecorationHintTextProperty
//    | inputDecorationHelperTextProperty
//    | inputDecorationIconProperty
//    ;
//
//inputDecorationLabelTextProperty
//    : LABELTEXT_ ':' SingleLineString
//    ;
//
//inputDecorationHintTextProperty
//    : HINTTEXT_ ':'SingleLineString
//    ;
//
//inputDecorationHelperTextProperty
//    : HELPERTEXT_ ':' SingleLineString
//    ;
//
//inputDecorationIconProperty
//    : ICON_ ':' IDENTIFIER
//    ;
//
//textFieldOnChangedProperty
//    :ONCHANGED_ ':' IDENTIFIER
//    ;
//
//////////////image///////////////////
//image:Image_ '('  (imageProperties ',')+   ')';
//imageProperties
//    : imageproperty
//    | height
//    |width
//    ;
//
// imageproperty:
// IMAGEIN_ ':' NETWORKIMAGE_ '(' SingleLineString ')';
// height:
// HEIGHT_ ':' NUMBER;
// width:
// WIDTH_ ':'NUMBER;
// ///////container////////////
// container :CONTAINER_ '('  containerproperties* child ')' SC |CONTAINER_ '(' child containerproperties*  ')' SC ;
// containerproperties
//          :color
//          |decoration
//          |height
//          |width ;
//
// child : CHILD_ ':' widgets  ;
// color :COLOR_ ':' COLORS_ D IDENTIFIER ;
//
// decoration : DECORATION_':' BOXDECORATION_'('(color |shape |color shape |shape color )')';
// shape : SHAPE_ ':' BOXSHAPE_ D IDENTIFIER;
//
////ROW&COLUMN
//row : ROW_ '(' (rowProperties (',')? ) ')' ;
//rowProperties :  children | rowproperty children | children rowproperty;
//rowproperty :(( MAINAXISALIGNMENTIN ':'  MAINAXISALIGNMENT) | (  CROSSAXISALIGNMENTIN ':' CROSSAXISALIGNMENT)  ) '.' ( CENTER | END | START ) ;
//children  : CHILDREN ':' '[' (widgets (',')? |  (widgets (','))+ )  ']' ',';
//
//column : COLUMN_ '(' columnProperties (',')? ')'  ;
//columnProperties :  children | (columnproperty)*  children   |  children columnproperty (',')?;
//columnproperty :(( MAINAXISALIGNMENTIN ':'  MAINAXISALIGNMENT) | (  CROSSAXISALIGNMENTIN ':' CROSSAXISALIGNMENT)  ) '.' ( CENTER | END | START ) ',' ;
//
//
//listView : LISTVIEW_  '('  listViewProperties  ')' ;
//listViewProperties : children | scrollDirection;
//scrollDirection : SCROLLDIRECTION ':' AXIS D (HORIZONTAL | VERTICAL);
//listViewBuilder : LISTVIEW_ D BUILDER '('  itemBuilder ( ',' itemCount )? ')';
//itemCount: ITEMCOUNT ':' INT ;
//itemBuilder: ITEMBUILDER ':' '(' CONTEXT ',' INTTYPE IDENTIFIER ')'  '{'  RETURN_ widgets SC '}';
//
//scaffold : SCAFFOLD '(' CHILD ':' body ')' ',';
//body: widgets ;