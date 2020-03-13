README
======

This repository holds bindings for COM libraries to be used in conjunction
with the [jna](https://github.com/java-native-access/jna).

The bindings are generated from the typelibraries of the COM libraries, that
hold the calling information. This also applies to the documentation, that is
present in the code.

Please note: Without the corresponding COM library installed the bindings are
not functional.

Usage
-----

You need to build this from source - run:

```
mvn install
```

This will publish the bindings into your local repository. If you run an
orginsation repository, you can add the distribution information to the parent
pom file located beside this file and then this should work:

```
mvn deploy
```

Add the typelibrary to the dependencies of the project and make sure the JNA
and JNA platform libraries are present in a version 4.3.0-SNAPSHOT or newer.

See:

 * [Excel Automation](https://github.com/java-native-access/jna/blob/master/contrib/msoffice/src/com/sun/jna/platform/win32/COM/util/office/Excelautomation_KB_219151_Mod.java)
 * [Word Automation](https://github.com/java-native-access/jna/blob/master/contrib/msoffice/src/com/sun/jna/platform/win32/COM/util/office/Wordautomation_KB_313193_Mod.java)

for examples.


Update Bindings
---------------

The source code can only be generated on a windows machine, after the code is
generated, the sources can be compiled and published from any OS.

- For each of the submodules delete the `src/main` folder
- Run `mvn eu.doppel-helix.jna.tlbcodegenerator:TlbCodeGenerator:generate install` from the project folder
- Fix the build of `onenote15` (remove offending methods)
- Run `mvn install`
- commit the new generated code to the repository