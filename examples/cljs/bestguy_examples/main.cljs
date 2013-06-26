(ns bestguy-examples.main)
;; This is a simple little web app for playing with the library in a
;; repl like fashon. It uses the bestguy threejs-clojurescript backend
;; and lets you write clojure in the browser and then compiles the
;; models and shows them in a threejs scene. It lets you create your
;; own or look through and play with a variety of premade examples.
;;
;; Depends on some js libraries.
;; three.js
;; 
;; Also does very chromey things for now and
;; probably won't work in other browsers.

(js/alert "hello world")
;; todo, figure out how to make a frontend app easily
;; use codemirror
