package com.example.myapplication.Database;

public class Database {

    public static String[] coreJavaQuestions = {
            "What do you know about Java?",
            "What are the supported platforms by Java Programming Language?",
            "List any five features of Java?",
            "Why is Java Architectural Neutral?",
            "How Java enabled High Performance?",
            "Why Java is considered dynamic?",
            "What is Java Virtual Machine and how it is considered in context of Java’s platform independent feature?",
            "List two Java IDE’s?",
            "List some Java keywords(unlike C, C++ keywords)?",
            "What do you mean by Object?",
            "Define class?",
            "What kind of variables a class can consist of?",
            "What is a Local Variable?",
            "What is a Instance Variable?",
            "What is a Class Variable?",
            "What is Singleton class?",
            "What do you mean by Constructor?",
            "List the three steps for creating an Object for a class?",
            "What is the default value of byte datatype in Java?",
            "What is the default value of float and double datatype in Java?",
            "When a byte datatype is used?",
            "What is a static variable?",
            "What do you mean by Access Modifier?"


    };
    public static String[] coreJavaAnswers = {
            "Java is a high-level programming language originally developed by Sun Microsystems and released in 1995. Java runs on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX.",
            "Java runs on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX/Linux like HP-Unix, Sun Solaris, Redhat Linux, Ubuntu, CentOS, etc.",
            "Some features include Object Oriented, Platform Independent, Robust, Interpreted, Multi-threaded",
            "It’s compiler generates an architecture-neutral object file format, which makes the compiled code to be executable on many processors, with the presence of Java runtime system.",
            "Java uses Just-In-Time compiler to enable high performance. Just-In-Time compiler is a program that turns Java bytecode, which is a program that contains instructions that must be interpreted into instructions that can be sent directly to the processor.",
            "It is designed to adapt to an evolving environment. Java programs can carry extensive amount of run-time information that can be used to verify and resolve accesses to objects on run-time.",
            "When Java is compiled, it is not compiled into platform specific machine, rather into platform independent byte code. This byte code is distributed over the web and interpreted by virtual Machine (JVM) on whichever platform it is being run.",
            "Netbeans, Eclipse, etc.",
            "Some Java keywords are import, super, finally, etc.",
            "Object is a runtime entity and it’s state is stored in fields and behavior is shown via methods. Methods operate on an object's internal state and serve as the primary mechanism for object-to-object communication.",
            "A class is a blue print from which individual objects are created. A class can contain fields and methods to describe the behavior of an object.",
            "A class consist of Local variable, instance variables and class variables.",
            "Variables defined inside methods, constructors or blocks are called local variables. The variable will be declared and initialized within the method and it will be destroyed when the method has completed.",
            "Instance variables are variables within a class but outside any method. These variables are instantiated when the class is loaded.",
            "These are variables declared with in a class, outside any method, with the static keyword.",
            "Singleton class control object creation, limiting the number to one but allowing the flexibility to create more objects if the situation changes.",
            "Constructor gets invoked when a new object is created. Every class has a constructor. If we do not explicitly write a constructor for a class the java compiler builds a default constructor for that class.",
            "An Object is first declared, then instantiated and then it is initialized.",
            "Default value of byte datatype is 0.",
            "Default value of float and double datatype in different as compared to C/C++. For float its 0.0f and for double it’s 0.0d",
            "This data type is used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an int.",
            "Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.",
            "Java provides access modifiers to set access levels for classes, variables, methods and constructors. A member has package or default accessibility when no accessibility modifier is specified."
    };

    public static String[] springQuestions = {
            "How did Spring came into existence and why to learn it?",
            "What are the applications of Spring?"
    };
    public static String[] springAnswers = {
            "Spring framework is an open source Java platform that provides comprehensive infrastructure support for developing robust Java applications very easily and very rapidly. " +
                    "Spring framework was initially written by Rod Johnson and was first released under the Apache 2.0 license in June 2003. This tutorial has been written based on Spring Framework version 4.1.6 released in Mar 2015. Spring is the most popular application development framework for enterprise Java. Millions of developers around the world use Spring Framework to create high performing, easily testable, and reusable code.\n" +
                    "\n" +
                    "Spring framework is an open source Java platform. It was initially written by Rod Johnson and was first released under the Apache 2.0 license in June 2003.\n" +
                    "\n" +
                    "Spring is lightweight when it comes to size and transparency. The basic version of Spring framework is around 2MB.\n" +
                    "\n" +
                    "The core features of the Spring Framework can be used in developing any Java application, but there are extensions for building web applications on top of the Java EE platform. Spring framework targets to make J2EE development easier to use and promotes good programming practices by enabling a POJO-based programming model.\n" +
                    "\n",

            "POJO Based - Spring enables developers to develop enterprise-class applications using POJOs. The benefit of using only POJOs is that you do not need an EJB container product such as an application server but you have the option of using only a robust servlet container such as Tomcat or some commercial product.\n" +
                    "\n" +
                    "Modular - Spring is organized in a modular fashion. Even though the number of packages and classes are substantial, you have to worry only about the ones you need and ignore the rest.\n" +
                    "\n" +
                    "Integration with existing frameworks - Spring does not reinvent the wheel, instead it truly makes use of some of the existing technologies like several ORM frameworks, logging frameworks, JEE, Quartz and JDK timers, and other view technologies.\n" +
                    "\n" +
                    "Testablity - Testing an application written with Spring is simple because environment-dependent code is moved into this framework. Furthermore, by using JavaBeanstyle POJOs, it becomes easier to use dependency injection for injecting test data.\n" +
                    "\n" +
                    "Web MVC - Spring's web framework is a well-designed web MVC framework, which provides a great alternative to web frameworks such as Struts or other over-engineered or less popular web frameworks.\n" +
                    "\n" +
                    "Central Exception Handling - Spring provides a convenient API to translate technology-specific exceptions (thrown by JDBC, Hibernate, or JDO, for example) into consistent, unchecked exceptions.\n" +
                    "\n" +
                    "Lightweight - Lightweight IoC containers tend to be lightweight, especially when compared to EJB containers, for example. This is beneficial for developing and deploying applications on computers with limited memory and CPU resources.\n" +
                    "\n" +
                    "Transaction management - Spring provides a consistent transaction management interface that can scale down to a local transaction (using a single database, for example) and scale up to global transactions (using JTA, for example)."

    };

}
