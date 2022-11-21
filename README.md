# jenkins
## input directive

The input directive on a stage allows you to prompt for input, using the input step. The stage will pause after any options have been applied, and before entering the agent block for that stage or evaluating the when condition of the stage. If the input is approved, the stage will then continue. Any parameters provided as part of the input submission will be available in the environment for the rest of the stage.

Configuration options
message
Required. This will be presented to the user when they go to submit the input.

id
An optional identifier for this input. The default value is based on the stage name.

ok
Optional text for the "ok" button on the input form.

submitter
An optional comma-separated list of users or external group names who are allowed to submit this input. Defaults to allowing any user.

submitterParameter
An optional name of an environment variable to set with the submitter name, if present.

parameters
An optional list of parameters to prompt the submitter to provide. See parameters for more information.
