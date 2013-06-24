(defproject bestguy "0.1.0-SNAPSHOT"
  :description "Library for declaritive creation of 3d models and creatures"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:examples
             {:dependencies [[ring/ring-core "1.2.0-beta1"]
                             [ring/ring-jetty-adapter "1.2.0-beta1"]
                             [compojure "1.1.5"]
                             [clojail "1.0.6"]]
              :plugins [[lein-cljsbuild "0.3.0"]]
              :source-paths ["examples/clj"]
              :cljsbuild
              {:builds
               [{:id "examples"
                 :source-paths ["examples/cljs"]
                 :compiler {:optomizations :simple
                            :output-to "resources/public/js/example.js"}}]}
              :main bestguy-examples.app}})

