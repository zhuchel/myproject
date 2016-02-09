diabetesRisk <- function(glucose) glucose / 200
shinyServer(
        function(input, output) {
                output$inputValue <- renderPrint({input$range})
                output$prediction <- renderPrint({diabetesRisk(input$glucose)})
        }
)