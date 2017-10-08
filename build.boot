(set-env! :resource-paths #{"src"}
          :dependencies `[[org.clojure/clojure ~(clojure-version)]
                          [ags799/bootlaces "a28f269"]])

(task-options! jar {:main 'ags799.mock-oauth2.main})

(require '[ags799.bootlaces :refer :all])

(bootlaces! 'ags799/mock-oauth2)
