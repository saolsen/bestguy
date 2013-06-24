(ns bestguy-examples.app
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.adapter.jetty :as jetty]
            [hiccup.core :as h])
  (:gen-class))

(defroutes app
  (GET "/" r
       (str "<!DOCTYPE html>"
            (h/html [:html
                     [:head
                      [:title "bestguy-example"]]
                     [:body
                      "hello world buddy"
                      [:script {:src "js/three.min.js"}]
                      [:script {:src "js/example.js"}]
                      ]
                     ])))
  (route/resources "/")
  (route/not-found "page not found"))

(defn create-app [port]
  (jetty/run-jetty #'app {:join? false :port port}))

(defn -main
  [& args]
  (let [port (Integer/parseInt (first args))
        server (create-app port)]
    (def server server)))
